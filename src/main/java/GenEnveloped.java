import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class GenEnveloped {


    public static void main(String[] args) throws Exception {
        digitallySignXML(new String[]{"pacs002.xml", "envelopedSignature.xml"});
       // System.out.println(isXmlDigitalSignatureValid("envelopedSignature.xml"));
    }

    private static final String C14N_TRANSFORM_METHOD ="http://www.w3.org/2006/12/xml-c14n11";
    public static void digitallySignXML(String[] args) throws Exception {

        // Instantiate the document to be signed
        Document doc = getDocument(args[0]);

        CertificateDetails certDetails = CertificateUtil.getCertificateDetails("/Users/lalluluke/Downloads/project/schema-finxact/keystore.jks", "password");

        DOMSignContext dsc = new DOMSignContext(certDetails.getPrivateKey(), doc.getChildNodes().item(0).getFirstChild().getNextSibling().getLastChild().getPreviousSibling());

        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

        List<Transform> transformList = new LinkedList<>();
        transformList.add(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
        transformList.add(fac.newTransform(C14N_TRANSFORM_METHOD, (TransformParameterSpec) null));


        Reference ref = fac.newReference
                ("", fac.newDigestMethod(DigestMethod.SHA256, null),
                        transformList,
                        null, null);

        // Create the SignedInfo
        SignedInfo si = fac.newSignedInfo
                (fac.newCanonicalizationMethod
                                (CanonicalizationMethod.INCLUSIVE,
                                        (C14NMethodParameterSpec) null),
                        fac.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", null),
                        Collections.singletonList(ref));

        // Load the KeyStore and get the signing key and certificate.
        X509Certificate cert = (X509Certificate) certDetails.getX509Certificate();

        // Create the KeyInfo containing the X509Data.
        KeyInfoFactory kif = fac.getKeyInfoFactory();
        List x509Content = new ArrayList();
        x509Content.add(cert.getSubjectX500Principal().getName());
        x509Content.add(cert);
        X509Data xd = kif.newX509Data(x509Content);
        KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));


        // Create the XMLSignature (but don't sign it yet)
        XMLSignature signature = fac.newXMLSignature(si, ki);

        // Marshal, generate (and sign) the enveloped signature
        signature.sign(dsc);

        // output the resulting document
        OutputStream os = new FileOutputStream(args[1]);

        TransformerFactory tf = TransformerFactory.newInstance();
        tf.setAttribute("indent-number", new Integer(2));
        Transformer trans = tf.newTransformer();
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        trans.transform(new DOMSource(doc), new StreamResult(new OutputStreamWriter(os, "utf-8")));
    }

    private static Document getDocument(String arg) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document doc = null;
        try (FileInputStream fis = new FileInputStream(arg)) {
            doc = dbf.newDocumentBuilder().parse(fis);
        }
        return doc;
    }

    public static boolean isXmlDigitalSignatureValid(String signedXmlFilePath) throws Exception {
        boolean validFlag = false;
        Document doc = getDocument(signedXmlFilePath);
        NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
        if (nl.getLength() == 0) {
            throw new Exception("No XML Digital Signature Found, document is discarded");
        }
        CertificateDetails certDetails = CertificateUtil.getCertificateDetails("/Users/lalluluke/Downloads/project/schema-finxact/keystore.jks", "password");
        PublicKey publicKey = certDetails.getX509Certificate().getPublicKey();

        //  PublicKey publicKey = new KryptoUtil().getStoredPublicKey(pubicKeyFilePath);
        DOMValidateContext valContext = new DOMValidateContext(publicKey, nl.item(0));
        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
        XMLSignature signature = fac.unmarshalXMLSignature(valContext);
        validFlag = signature.validate(valContext);
        return validFlag;
    }

}