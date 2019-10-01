
package com.finxact.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Transaction EFT
 * <p>
 * Financial transaction EFT detail (ISO8583)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msgType",
    "acqNetCode",
    "procNetCode",
    "acqInstId",
    "acqInstCntry",
    "acqName",
    "fwdInstId",
    "fwdInstCntry",
    "merchantCode",
    "acceptorId",
    "terminalId",
    "threadId",
    "acceptor",
    "cardNbr",
    "seqNbr",
    "expireDtm",
    "pin",
    "verCode",
    "acctType1",
    "acctType2",
    "captureDtm",
    "xmitDtm",
    "settleDtm",
    "trnType",
    "trnAmt",
    "trnFee",
    "procFee",
    "ccyCode",
    "custAmt",
    "custFee",
    "fxCust",
    "fxSettle",
    "panEntry",
    "pinEntry",
    "payee",
    "authId",
    "authCode",
    "authExpDtm",
    "responseCode",
    "reasonCodes",
    "posStatus",
    "posGeo",
    "addStar2",
    "token",
    "userToken",
    "businessToken",
    "actingUserToken",
    "cardToken",
    "trnTypeDesc",
    "state",
    "dur",
    "createdDtm",
    "userTransactionDtm",
    "rqAmt",
    "apprCode",
    "response",
    "network",
    "subNetwork",
    "precedingTrnToken",
    "isProvCr",
    "cashbackAmt"
})
public class Eft {

    /**
     * Message Type
     * <p>
     * Eft network message type
     * 
     */
    @JsonProperty("msgType")
    @JsonPropertyDescription("Eft network message type")
    private Integer msgType;
    /**
     * Acquiring network code
     * <p>
     * Network identification code of the acquiring network
     * 
     */
    @JsonProperty("acqNetCode")
    @JsonPropertyDescription("Network identification code of the acquiring network")
    private String acqNetCode;
    /**
     * Processing network code
     * <p>
     * Card issuer processor network identification code
     * 
     */
    @JsonProperty("procNetCode")
    @JsonPropertyDescription("Card issuer processor network identification code")
    private String procNetCode;
    /**
     * Acquiring institution
     * <p>
     * Code identifying the acquiring institution or its agent
     * 
     */
    @JsonProperty("acqInstId")
    @JsonPropertyDescription("Code identifying the acquiring institution or its agent")
    private Integer acqInstId;
    /**
     * Acquiring institution country code
     * <p>
     * Code identifying the acquiring institution country
     * 
     */
    @JsonProperty("acqInstCntry")
    @JsonPropertyDescription("Code identifying the acquiring institution country")
    private String acqInstCntry;
    /**
     * Acquirer name
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("acqName")
    @JsonPropertyDescription("Institution or merchant name of the transaction acquirer")
    private String acqName;
    /**
     * Forwarding institution
     * <p>
     * Code identifying the forwarding institution or its agent
     * 
     */
    @JsonProperty("fwdInstId")
    @JsonPropertyDescription("Code identifying the forwarding institution or its agent")
    private Integer fwdInstId;
    /**
     * Forwarding institution country code
     * <p>
     * Code identifying the forwarding institution country
     * 
     */
    @JsonProperty("fwdInstCntry")
    @JsonPropertyDescription("Code identifying the forwarding institution country")
    private String fwdInstCntry;
    /**
     * Merchant code
     * <p>
     * The Standard Industrial Classification (SIC) code for the merchant’s type of business or service
     * 
     */
    @JsonProperty("merchantCode")
    @JsonPropertyDescription("The Standard Industrial Classification (SIC) code for the merchant\u2019s type of business or service")
    private Integer merchantCode;
    /**
     * Card acceptor identification
     * <p>
     * Merchant number assigned by the acquirer
     * 
     */
    @JsonProperty("acceptorId")
    @JsonPropertyDescription("Merchant number assigned by the acquirer")
    private String acceptorId;
    /**
     * Card acceptor terminal identification
     * <p>
     * Unique code identifying a terminal at the card acceptor location
     * 
     */
    @JsonProperty("terminalId")
    @JsonPropertyDescription("Unique code identifying a terminal at the card acceptor location")
    private String terminalId;
    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages")
    private String threadId;
    /**
     * Card acceptor
     * <p>
     * The name and location of the card acceptor that defines the point of sale
     * 
     */
    @JsonProperty("acceptor")
    @JsonPropertyDescription("The name and location of the card acceptor that defines the point of sale")
    private String acceptor;
    /**
     * Payment card number
     * <p>
     * Primary account number (PAN) embossed on the card
     * 
     */
    @JsonProperty("cardNbr")
    @JsonPropertyDescription("Primary account number (PAN) embossed on the card")
    private Integer cardNbr;
    /**
     * Card sequence number
     * <p>
     * Number that distinguishes separate cards having the same primary account number
     * 
     */
    @JsonProperty("seqNbr")
    @JsonPropertyDescription("Number that distinguishes separate cards having the same primary account number")
    private Integer seqNbr;
    /**
     * Card expiration date
     * <p>
     * The year and month that the card expires
     * 
     */
    @JsonProperty("expireDtm")
    @JsonPropertyDescription("The year and month that the card expires")
    private Date expireDtm;
    /**
     * Personal Identification Number
     * <p>
     * Personal Identification Number (PIN) - encrypted
     * 
     */
    @JsonProperty("pin")
    @JsonPropertyDescription("Personal Identification Number (PIN) - encrypted")
    private String pin;
    /**
     * Verification code
     * <p>
     * Address and/or card verification data (AVS/CVC2/CVV)
     * 
     */
    @JsonProperty("verCode")
    @JsonPropertyDescription("Address and/or card verification data (AVS/CVC2/CVV)")
    private String verCode;
    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType1")
    @JsonPropertyDescription("Acct Type")
    private AcctType1 acctType1;
    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType2")
    @JsonPropertyDescription("Acct Type")
    private AcctType1 acctType2;
    /**
     * Capture date
     * <p>
     * The date the acquirer processed the transaction
     * 
     */
    @JsonProperty("captureDtm")
    @JsonPropertyDescription("The date the acquirer processed the transaction")
    private Date captureDtm;
    /**
     * Transmission date
     * <p>
     * The datetime the acquiring network transmitted the message
     * 
     */
    @JsonProperty("xmitDtm")
    @JsonPropertyDescription("The datetime the acquiring network transmitted the message")
    private Date xmitDtm;
    /**
     * Settlement date
     * <p>
     * The datetime the the transaction will be settled between the acquirer and issuer
     * 
     */
    @JsonProperty("settleDtm")
    @JsonPropertyDescription("The datetime the the transaction will be settled between the acquirer and issuer")
    private Date settleDtm;
    /**
     * EFT transaction type
     * <p>
     * EFT transaction type code
     * 
     */
    @JsonProperty("trnType")
    @JsonPropertyDescription("EFT transaction type code")
    private Integer trnType;
    /**
     * Transaction amount
     * <p>
     * Transaction amount, excluding trnFee
     * 
     */
    @JsonProperty("trnAmt")
    @JsonPropertyDescription("Transaction amount, excluding trnFee")
    private Double trnAmt;
    /**
     * Transaction fee amount
     * <p>
     * Surcharge or general transaction fee charged for the transaction
     * 
     */
    @JsonProperty("trnFee")
    @JsonPropertyDescription("Surcharge or general transaction fee charged for the transaction")
    private Double trnFee;
    /**
     * Processing fee amount
     * <p>
     * Fee for handling and routing the transaction
     * 
     */
    @JsonProperty("procFee")
    @JsonPropertyDescription("Fee for handling and routing the transaction")
    private Double procFee;
    /**
     * Currency code
     * <p>
     * Transaction currency code for trnAmt, trnFee and procFee
     * 
     */
    @JsonProperty("ccyCode")
    @JsonPropertyDescription("Transaction currency code for trnAmt, trnFee and procFee")
    private String ccyCode;
    /**
     * Customer amount
     * <p>
     * Amount posted to the customer account in the currency of the account, excluding custFee
     * 
     */
    @JsonProperty("custAmt")
    @JsonPropertyDescription("Amount posted to the customer account in the currency of the account, excluding custFee")
    private Double custAmt;
    /**
     * Customer fee amount
     * <p>
     * Fee to be posted to the customer account in the currency of the account
     * 
     */
    @JsonProperty("custFee")
    @JsonPropertyDescription("Fee to be posted to the customer account in the currency of the account")
    private Double custFee;
    /**
     * Customer exchange
     * <p>
     * Customer exchange information if account currency code is not the transaction currency code
     * 
     */
    @JsonProperty("fxCust")
    @JsonPropertyDescription("Customer exchange information if account currency code is not the transaction currency code")
    private FxCust fxCust;
    /**
     * Settlement exchange
     * <p>
     * Settlement exchange information
     * 
     */
    @JsonProperty("fxSettle")
    @JsonPropertyDescription("Settlement exchange information")
    private FxSettle fxSettle;
    /**
     * PAN entry code
     * <p>
     * Indicates how the primary account number (PAN) was entered into the system
     * 
     */
    @JsonProperty("panEntry")
    @JsonPropertyDescription("Indicates how the primary account number (PAN) was entered into the system")
    private Integer panEntry;
    /**
     * PIN entry code
     * <p>
     * Indicates how and if the PIN was entered
     * 
     */
    @JsonProperty("pinEntry")
    @JsonPropertyDescription("Indicates how and if the PIN was entered")
    private Integer pinEntry;
    /**
     * Payee
     * <p>
     * The third party beneficiary in a payment transaction
     * 
     */
    @JsonProperty("payee")
    @JsonPropertyDescription("The third party beneficiary in a payment transaction")
    private String payee;
    /**
     * Authorization identification
     * <p>
     * The processor assigned authorization request reference used to match messages throughout the lifecycle of a transaction
     * 
     */
    @JsonProperty("authId")
    @JsonPropertyDescription("The processor assigned authorization request reference used to match messages throughout the lifecycle of a transaction")
    private String authId;
    /**
     * Authorization code
     * <p>
     * Authorization response code assigned by the authorizing institution
     * 
     */
    @JsonProperty("authCode")
    @JsonPropertyDescription("Authorization response code assigned by the authorizing institution")
    private String authCode;
    /**
     * Authorization expiration
     * <p>
     * The date andtime that authorization expires
     * 
     */
    @JsonProperty("authExpDtm")
    @JsonPropertyDescription("The date andtime that authorization expires")
    private Date authExpDtm;
    /**
     * Message response code
     * <p>
     * Code describing the response to a request message
     * 
     */
    @JsonProperty("responseCode")
    @JsonPropertyDescription("Code describing the response to a request message")
    private String responseCode;
    /**
     * Reason codes
     * <p>
     * Advice/Reversal reason codes
     * 
     */
    @JsonProperty("reasonCodes")
    @JsonPropertyDescription("Advice/Reversal reason codes")
    private ReasonCodes reasonCodes;
    /**
     * POS status condition
     * <p>
     * Point of service (POS) condition
     * 
     */
    @JsonProperty("posStatus")
    @JsonPropertyDescription("Point of service (POS) condition")
    private PosStatus posStatus;
    /**
     * POS geographic data
     * <p>
     * Point of service (POS) geographic data
     * 
     */
    @JsonProperty("posGeo")
    @JsonPropertyDescription("Point of service (POS) geographic data")
    private PosGeo posGeo;
    /**
     * Additional STAR network
     * <p>
     * Additional data STAR network (RAW data)
     * 
     */
    @JsonProperty("addStar2")
    @JsonPropertyDescription("Additional data STAR network (RAW data)")
    private String addStar2;
    /**
     * Transaction Token
     * <p>
     * Unique External Vendor Transaction ID
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Unique External Vendor Transaction ID")
    private String token;
    /**
     * User Token
     * <p>
     * Unique external vendor ID of the user that owns the account
     * 
     */
    @JsonProperty("userToken")
    @JsonPropertyDescription("Unique external vendor ID of the user that owns the account")
    private String userToken;
    /**
     * Business Token
     * <p>
     * Unique external vendor ID of business (bank)
     * 
     */
    @JsonProperty("businessToken")
    @JsonPropertyDescription("Unique external vendor ID of business (bank)")
    private String businessToken;
    /**
     * Acting User Token
     * <p>
     * Acting external vendor ID of user. Can be parent account
     * 
     */
    @JsonProperty("actingUserToken")
    @JsonPropertyDescription("Acting external vendor ID of user. Can be parent account")
    private String actingUserToken;
    /**
     * Card Token
     * <p>
     * Unique external vendor ID of card tokenized.
     * 
     */
    @JsonProperty("cardToken")
    @JsonPropertyDescription("Unique external vendor ID of card tokenized.")
    private String cardToken;
    /**
     * Transaction Type
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("trnTypeDesc")
    @JsonPropertyDescription("Institution or merchant name of the transaction acquirer")
    private String trnTypeDesc;
    /**
     * State of Transaction
     * <p>
     * State or Status of Transaction
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State or Status of Transaction")
    private String state;
    /**
     * Duration of Transaction
     * <p>
     * Duration of transaction in external vendor in milliseconds
     * 
     */
    @JsonProperty("dur")
    @JsonPropertyDescription("Duration of transaction in external vendor in milliseconds")
    private Integer dur;
    /**
     * Created datetime
     * <p>
     * The datetime external vendor created the transaction
     * 
     */
    @JsonProperty("createdDtm")
    @JsonPropertyDescription("The datetime external vendor created the transaction")
    private Date createdDtm;
    /**
     * User transaction datetime
     * <p>
     * The datetime the external vendor user created the transaction
     * 
     */
    @JsonProperty("userTransactionDtm")
    @JsonPropertyDescription("The datetime the external vendor user created the transaction")
    private Date userTransactionDtm;
    /**
     * Requested Amount
     * <p>
     * Used for settling transactions in external vendor
     * 
     */
    @JsonProperty("rqAmt")
    @JsonPropertyDescription("Used for settling transactions in external vendor")
    private Double rqAmt;
    /**
     * Approval Code
     * <p>
     * The approval code for the transaction in external vendor
     * 
     */
    @JsonProperty("apprCode")
    @JsonPropertyDescription("The approval code for the transaction in external vendor")
    private String apprCode;
    /**
     * Response
     * <p>
     * Object containing the response code and memo from external vendor
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("Object containing the response code and memo from external vendor")
    private Response response;
    /**
     * Transaction Network
     * <p>
     * Transaction Network
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Transaction Network")
    private String network;
    /**
     * Sub Network
     * <p>
     * Sub Network
     * 
     */
    @JsonProperty("subNetwork")
    @JsonPropertyDescription("Sub Network")
    private String subNetwork;
    /**
     * Preceding Transaction Token
     * <p>
     * Preceding Transaction Token
     * 
     */
    @JsonProperty("precedingTrnToken")
    @JsonPropertyDescription("Preceding Transaction Token")
    private String precedingTrnToken;
    /**
     * Is Provisional Credit
     * <p>
     * Is this chargeback in a provisional credit flow
     * 
     */
    @JsonProperty("isProvCr")
    @JsonPropertyDescription("Is this chargeback in a provisional credit flow")
    private Boolean isProvCr;
    /**
     * Cashback amount
     * <p>
     * Cashback amount
     * 
     */
    @JsonProperty("cashbackAmt")
    @JsonPropertyDescription("Cashback amount")
    private Double cashbackAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Message Type
     * <p>
     * Eft network message type
     * 
     */
    @JsonProperty("msgType")
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * Message Type
     * <p>
     * Eft network message type
     * 
     */
    @JsonProperty("msgType")
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * Acquiring network code
     * <p>
     * Network identification code of the acquiring network
     * 
     */
    @JsonProperty("acqNetCode")
    public String getAcqNetCode() {
        return acqNetCode;
    }

    /**
     * Acquiring network code
     * <p>
     * Network identification code of the acquiring network
     * 
     */
    @JsonProperty("acqNetCode")
    public void setAcqNetCode(String acqNetCode) {
        this.acqNetCode = acqNetCode;
    }

    /**
     * Processing network code
     * <p>
     * Card issuer processor network identification code
     * 
     */
    @JsonProperty("procNetCode")
    public String getProcNetCode() {
        return procNetCode;
    }

    /**
     * Processing network code
     * <p>
     * Card issuer processor network identification code
     * 
     */
    @JsonProperty("procNetCode")
    public void setProcNetCode(String procNetCode) {
        this.procNetCode = procNetCode;
    }

    /**
     * Acquiring institution
     * <p>
     * Code identifying the acquiring institution or its agent
     * 
     */
    @JsonProperty("acqInstId")
    public Integer getAcqInstId() {
        return acqInstId;
    }

    /**
     * Acquiring institution
     * <p>
     * Code identifying the acquiring institution or its agent
     * 
     */
    @JsonProperty("acqInstId")
    public void setAcqInstId(Integer acqInstId) {
        this.acqInstId = acqInstId;
    }

    /**
     * Acquiring institution country code
     * <p>
     * Code identifying the acquiring institution country
     * 
     */
    @JsonProperty("acqInstCntry")
    public String getAcqInstCntry() {
        return acqInstCntry;
    }

    /**
     * Acquiring institution country code
     * <p>
     * Code identifying the acquiring institution country
     * 
     */
    @JsonProperty("acqInstCntry")
    public void setAcqInstCntry(String acqInstCntry) {
        this.acqInstCntry = acqInstCntry;
    }

    /**
     * Acquirer name
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("acqName")
    public String getAcqName() {
        return acqName;
    }

    /**
     * Acquirer name
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("acqName")
    public void setAcqName(String acqName) {
        this.acqName = acqName;
    }

    /**
     * Forwarding institution
     * <p>
     * Code identifying the forwarding institution or its agent
     * 
     */
    @JsonProperty("fwdInstId")
    public Integer getFwdInstId() {
        return fwdInstId;
    }

    /**
     * Forwarding institution
     * <p>
     * Code identifying the forwarding institution or its agent
     * 
     */
    @JsonProperty("fwdInstId")
    public void setFwdInstId(Integer fwdInstId) {
        this.fwdInstId = fwdInstId;
    }

    /**
     * Forwarding institution country code
     * <p>
     * Code identifying the forwarding institution country
     * 
     */
    @JsonProperty("fwdInstCntry")
    public String getFwdInstCntry() {
        return fwdInstCntry;
    }

    /**
     * Forwarding institution country code
     * <p>
     * Code identifying the forwarding institution country
     * 
     */
    @JsonProperty("fwdInstCntry")
    public void setFwdInstCntry(String fwdInstCntry) {
        this.fwdInstCntry = fwdInstCntry;
    }

    /**
     * Merchant code
     * <p>
     * The Standard Industrial Classification (SIC) code for the merchant’s type of business or service
     * 
     */
    @JsonProperty("merchantCode")
    public Integer getMerchantCode() {
        return merchantCode;
    }

    /**
     * Merchant code
     * <p>
     * The Standard Industrial Classification (SIC) code for the merchant’s type of business or service
     * 
     */
    @JsonProperty("merchantCode")
    public void setMerchantCode(Integer merchantCode) {
        this.merchantCode = merchantCode;
    }

    /**
     * Card acceptor identification
     * <p>
     * Merchant number assigned by the acquirer
     * 
     */
    @JsonProperty("acceptorId")
    public String getAcceptorId() {
        return acceptorId;
    }

    /**
     * Card acceptor identification
     * <p>
     * Merchant number assigned by the acquirer
     * 
     */
    @JsonProperty("acceptorId")
    public void setAcceptorId(String acceptorId) {
        this.acceptorId = acceptorId;
    }

    /**
     * Card acceptor terminal identification
     * <p>
     * Unique code identifying a terminal at the card acceptor location
     * 
     */
    @JsonProperty("terminalId")
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Card acceptor terminal identification
     * <p>
     * Unique code identifying a terminal at the card acceptor location
     * 
     */
    @JsonProperty("terminalId")
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    public String getThreadId() {
        return threadId;
    }

    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * Card acceptor
     * <p>
     * The name and location of the card acceptor that defines the point of sale
     * 
     */
    @JsonProperty("acceptor")
    public String getAcceptor() {
        return acceptor;
    }

    /**
     * Card acceptor
     * <p>
     * The name and location of the card acceptor that defines the point of sale
     * 
     */
    @JsonProperty("acceptor")
    public void setAcceptor(String acceptor) {
        this.acceptor = acceptor;
    }

    /**
     * Payment card number
     * <p>
     * Primary account number (PAN) embossed on the card
     * 
     */
    @JsonProperty("cardNbr")
    public Integer getCardNbr() {
        return cardNbr;
    }

    /**
     * Payment card number
     * <p>
     * Primary account number (PAN) embossed on the card
     * 
     */
    @JsonProperty("cardNbr")
    public void setCardNbr(Integer cardNbr) {
        this.cardNbr = cardNbr;
    }

    /**
     * Card sequence number
     * <p>
     * Number that distinguishes separate cards having the same primary account number
     * 
     */
    @JsonProperty("seqNbr")
    public Integer getSeqNbr() {
        return seqNbr;
    }

    /**
     * Card sequence number
     * <p>
     * Number that distinguishes separate cards having the same primary account number
     * 
     */
    @JsonProperty("seqNbr")
    public void setSeqNbr(Integer seqNbr) {
        this.seqNbr = seqNbr;
    }

    /**
     * Card expiration date
     * <p>
     * The year and month that the card expires
     * 
     */
    @JsonProperty("expireDtm")
    public Date getExpireDtm() {
        return expireDtm;
    }

    /**
     * Card expiration date
     * <p>
     * The year and month that the card expires
     * 
     */
    @JsonProperty("expireDtm")
    public void setExpireDtm(Date expireDtm) {
        this.expireDtm = expireDtm;
    }

    /**
     * Personal Identification Number
     * <p>
     * Personal Identification Number (PIN) - encrypted
     * 
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * Personal Identification Number
     * <p>
     * Personal Identification Number (PIN) - encrypted
     * 
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * Verification code
     * <p>
     * Address and/or card verification data (AVS/CVC2/CVV)
     * 
     */
    @JsonProperty("verCode")
    public String getVerCode() {
        return verCode;
    }

    /**
     * Verification code
     * <p>
     * Address and/or card verification data (AVS/CVC2/CVV)
     * 
     */
    @JsonProperty("verCode")
    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }

    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType1")
    public AcctType1 getAcctType1() {
        return acctType1;
    }

    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType1")
    public void setAcctType1(AcctType1 acctType1) {
        this.acctType1 = acctType1;
    }

    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType2")
    public AcctType1 getAcctType2() {
        return acctType2;
    }

    /**
     * Acct Type
     * <p>
     * Acct Type
     * 
     */
    @JsonProperty("acctType2")
    public void setAcctType2(AcctType1 acctType2) {
        this.acctType2 = acctType2;
    }

    /**
     * Capture date
     * <p>
     * The date the acquirer processed the transaction
     * 
     */
    @JsonProperty("captureDtm")
    public Date getCaptureDtm() {
        return captureDtm;
    }

    /**
     * Capture date
     * <p>
     * The date the acquirer processed the transaction
     * 
     */
    @JsonProperty("captureDtm")
    public void setCaptureDtm(Date captureDtm) {
        this.captureDtm = captureDtm;
    }

    /**
     * Transmission date
     * <p>
     * The datetime the acquiring network transmitted the message
     * 
     */
    @JsonProperty("xmitDtm")
    public Date getXmitDtm() {
        return xmitDtm;
    }

    /**
     * Transmission date
     * <p>
     * The datetime the acquiring network transmitted the message
     * 
     */
    @JsonProperty("xmitDtm")
    public void setXmitDtm(Date xmitDtm) {
        this.xmitDtm = xmitDtm;
    }

    /**
     * Settlement date
     * <p>
     * The datetime the the transaction will be settled between the acquirer and issuer
     * 
     */
    @JsonProperty("settleDtm")
    public Date getSettleDtm() {
        return settleDtm;
    }

    /**
     * Settlement date
     * <p>
     * The datetime the the transaction will be settled between the acquirer and issuer
     * 
     */
    @JsonProperty("settleDtm")
    public void setSettleDtm(Date settleDtm) {
        this.settleDtm = settleDtm;
    }

    /**
     * EFT transaction type
     * <p>
     * EFT transaction type code
     * 
     */
    @JsonProperty("trnType")
    public Integer getTrnType() {
        return trnType;
    }

    /**
     * EFT transaction type
     * <p>
     * EFT transaction type code
     * 
     */
    @JsonProperty("trnType")
    public void setTrnType(Integer trnType) {
        this.trnType = trnType;
    }

    /**
     * Transaction amount
     * <p>
     * Transaction amount, excluding trnFee
     * 
     */
    @JsonProperty("trnAmt")
    public Double getTrnAmt() {
        return trnAmt;
    }

    /**
     * Transaction amount
     * <p>
     * Transaction amount, excluding trnFee
     * 
     */
    @JsonProperty("trnAmt")
    public void setTrnAmt(Double trnAmt) {
        this.trnAmt = trnAmt;
    }

    /**
     * Transaction fee amount
     * <p>
     * Surcharge or general transaction fee charged for the transaction
     * 
     */
    @JsonProperty("trnFee")
    public Double getTrnFee() {
        return trnFee;
    }

    /**
     * Transaction fee amount
     * <p>
     * Surcharge or general transaction fee charged for the transaction
     * 
     */
    @JsonProperty("trnFee")
    public void setTrnFee(Double trnFee) {
        this.trnFee = trnFee;
    }

    /**
     * Processing fee amount
     * <p>
     * Fee for handling and routing the transaction
     * 
     */
    @JsonProperty("procFee")
    public Double getProcFee() {
        return procFee;
    }

    /**
     * Processing fee amount
     * <p>
     * Fee for handling and routing the transaction
     * 
     */
    @JsonProperty("procFee")
    public void setProcFee(Double procFee) {
        this.procFee = procFee;
    }

    /**
     * Currency code
     * <p>
     * Transaction currency code for trnAmt, trnFee and procFee
     * 
     */
    @JsonProperty("ccyCode")
    public String getCcyCode() {
        return ccyCode;
    }

    /**
     * Currency code
     * <p>
     * Transaction currency code for trnAmt, trnFee and procFee
     * 
     */
    @JsonProperty("ccyCode")
    public void setCcyCode(String ccyCode) {
        this.ccyCode = ccyCode;
    }

    /**
     * Customer amount
     * <p>
     * Amount posted to the customer account in the currency of the account, excluding custFee
     * 
     */
    @JsonProperty("custAmt")
    public Double getCustAmt() {
        return custAmt;
    }

    /**
     * Customer amount
     * <p>
     * Amount posted to the customer account in the currency of the account, excluding custFee
     * 
     */
    @JsonProperty("custAmt")
    public void setCustAmt(Double custAmt) {
        this.custAmt = custAmt;
    }

    /**
     * Customer fee amount
     * <p>
     * Fee to be posted to the customer account in the currency of the account
     * 
     */
    @JsonProperty("custFee")
    public Double getCustFee() {
        return custFee;
    }

    /**
     * Customer fee amount
     * <p>
     * Fee to be posted to the customer account in the currency of the account
     * 
     */
    @JsonProperty("custFee")
    public void setCustFee(Double custFee) {
        this.custFee = custFee;
    }

    /**
     * Customer exchange
     * <p>
     * Customer exchange information if account currency code is not the transaction currency code
     * 
     */
    @JsonProperty("fxCust")
    public FxCust getFxCust() {
        return fxCust;
    }

    /**
     * Customer exchange
     * <p>
     * Customer exchange information if account currency code is not the transaction currency code
     * 
     */
    @JsonProperty("fxCust")
    public void setFxCust(FxCust fxCust) {
        this.fxCust = fxCust;
    }

    /**
     * Settlement exchange
     * <p>
     * Settlement exchange information
     * 
     */
    @JsonProperty("fxSettle")
    public FxSettle getFxSettle() {
        return fxSettle;
    }

    /**
     * Settlement exchange
     * <p>
     * Settlement exchange information
     * 
     */
    @JsonProperty("fxSettle")
    public void setFxSettle(FxSettle fxSettle) {
        this.fxSettle = fxSettle;
    }

    /**
     * PAN entry code
     * <p>
     * Indicates how the primary account number (PAN) was entered into the system
     * 
     */
    @JsonProperty("panEntry")
    public Integer getPanEntry() {
        return panEntry;
    }

    /**
     * PAN entry code
     * <p>
     * Indicates how the primary account number (PAN) was entered into the system
     * 
     */
    @JsonProperty("panEntry")
    public void setPanEntry(Integer panEntry) {
        this.panEntry = panEntry;
    }

    /**
     * PIN entry code
     * <p>
     * Indicates how and if the PIN was entered
     * 
     */
    @JsonProperty("pinEntry")
    public Integer getPinEntry() {
        return pinEntry;
    }

    /**
     * PIN entry code
     * <p>
     * Indicates how and if the PIN was entered
     * 
     */
    @JsonProperty("pinEntry")
    public void setPinEntry(Integer pinEntry) {
        this.pinEntry = pinEntry;
    }

    /**
     * Payee
     * <p>
     * The third party beneficiary in a payment transaction
     * 
     */
    @JsonProperty("payee")
    public String getPayee() {
        return payee;
    }

    /**
     * Payee
     * <p>
     * The third party beneficiary in a payment transaction
     * 
     */
    @JsonProperty("payee")
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * Authorization identification
     * <p>
     * The processor assigned authorization request reference used to match messages throughout the lifecycle of a transaction
     * 
     */
    @JsonProperty("authId")
    public String getAuthId() {
        return authId;
    }

    /**
     * Authorization identification
     * <p>
     * The processor assigned authorization request reference used to match messages throughout the lifecycle of a transaction
     * 
     */
    @JsonProperty("authId")
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    /**
     * Authorization code
     * <p>
     * Authorization response code assigned by the authorizing institution
     * 
     */
    @JsonProperty("authCode")
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Authorization code
     * <p>
     * Authorization response code assigned by the authorizing institution
     * 
     */
    @JsonProperty("authCode")
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * Authorization expiration
     * <p>
     * The date andtime that authorization expires
     * 
     */
    @JsonProperty("authExpDtm")
    public Date getAuthExpDtm() {
        return authExpDtm;
    }

    /**
     * Authorization expiration
     * <p>
     * The date andtime that authorization expires
     * 
     */
    @JsonProperty("authExpDtm")
    public void setAuthExpDtm(Date authExpDtm) {
        this.authExpDtm = authExpDtm;
    }

    /**
     * Message response code
     * <p>
     * Code describing the response to a request message
     * 
     */
    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Message response code
     * <p>
     * Code describing the response to a request message
     * 
     */
    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Reason codes
     * <p>
     * Advice/Reversal reason codes
     * 
     */
    @JsonProperty("reasonCodes")
    public ReasonCodes getReasonCodes() {
        return reasonCodes;
    }

    /**
     * Reason codes
     * <p>
     * Advice/Reversal reason codes
     * 
     */
    @JsonProperty("reasonCodes")
    public void setReasonCodes(ReasonCodes reasonCodes) {
        this.reasonCodes = reasonCodes;
    }

    /**
     * POS status condition
     * <p>
     * Point of service (POS) condition
     * 
     */
    @JsonProperty("posStatus")
    public PosStatus getPosStatus() {
        return posStatus;
    }

    /**
     * POS status condition
     * <p>
     * Point of service (POS) condition
     * 
     */
    @JsonProperty("posStatus")
    public void setPosStatus(PosStatus posStatus) {
        this.posStatus = posStatus;
    }

    /**
     * POS geographic data
     * <p>
     * Point of service (POS) geographic data
     * 
     */
    @JsonProperty("posGeo")
    public PosGeo getPosGeo() {
        return posGeo;
    }

    /**
     * POS geographic data
     * <p>
     * Point of service (POS) geographic data
     * 
     */
    @JsonProperty("posGeo")
    public void setPosGeo(PosGeo posGeo) {
        this.posGeo = posGeo;
    }

    /**
     * Additional STAR network
     * <p>
     * Additional data STAR network (RAW data)
     * 
     */
    @JsonProperty("addStar2")
    public String getAddStar2() {
        return addStar2;
    }

    /**
     * Additional STAR network
     * <p>
     * Additional data STAR network (RAW data)
     * 
     */
    @JsonProperty("addStar2")
    public void setAddStar2(String addStar2) {
        this.addStar2 = addStar2;
    }

    /**
     * Transaction Token
     * <p>
     * Unique External Vendor Transaction ID
     * 
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * Transaction Token
     * <p>
     * Unique External Vendor Transaction ID
     * 
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * User Token
     * <p>
     * Unique external vendor ID of the user that owns the account
     * 
     */
    @JsonProperty("userToken")
    public String getUserToken() {
        return userToken;
    }

    /**
     * User Token
     * <p>
     * Unique external vendor ID of the user that owns the account
     * 
     */
    @JsonProperty("userToken")
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * Business Token
     * <p>
     * Unique external vendor ID of business (bank)
     * 
     */
    @JsonProperty("businessToken")
    public String getBusinessToken() {
        return businessToken;
    }

    /**
     * Business Token
     * <p>
     * Unique external vendor ID of business (bank)
     * 
     */
    @JsonProperty("businessToken")
    public void setBusinessToken(String businessToken) {
        this.businessToken = businessToken;
    }

    /**
     * Acting User Token
     * <p>
     * Acting external vendor ID of user. Can be parent account
     * 
     */
    @JsonProperty("actingUserToken")
    public String getActingUserToken() {
        return actingUserToken;
    }

    /**
     * Acting User Token
     * <p>
     * Acting external vendor ID of user. Can be parent account
     * 
     */
    @JsonProperty("actingUserToken")
    public void setActingUserToken(String actingUserToken) {
        this.actingUserToken = actingUserToken;
    }

    /**
     * Card Token
     * <p>
     * Unique external vendor ID of card tokenized.
     * 
     */
    @JsonProperty("cardToken")
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Card Token
     * <p>
     * Unique external vendor ID of card tokenized.
     * 
     */
    @JsonProperty("cardToken")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Transaction Type
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("trnTypeDesc")
    public String getTrnTypeDesc() {
        return trnTypeDesc;
    }

    /**
     * Transaction Type
     * <p>
     * Institution or merchant name of the transaction acquirer
     * 
     */
    @JsonProperty("trnTypeDesc")
    public void setTrnTypeDesc(String trnTypeDesc) {
        this.trnTypeDesc = trnTypeDesc;
    }

    /**
     * State of Transaction
     * <p>
     * State or Status of Transaction
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State of Transaction
     * <p>
     * State or Status of Transaction
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Duration of Transaction
     * <p>
     * Duration of transaction in external vendor in milliseconds
     * 
     */
    @JsonProperty("dur")
    public Integer getDur() {
        return dur;
    }

    /**
     * Duration of Transaction
     * <p>
     * Duration of transaction in external vendor in milliseconds
     * 
     */
    @JsonProperty("dur")
    public void setDur(Integer dur) {
        this.dur = dur;
    }

    /**
     * Created datetime
     * <p>
     * The datetime external vendor created the transaction
     * 
     */
    @JsonProperty("createdDtm")
    public Date getCreatedDtm() {
        return createdDtm;
    }

    /**
     * Created datetime
     * <p>
     * The datetime external vendor created the transaction
     * 
     */
    @JsonProperty("createdDtm")
    public void setCreatedDtm(Date createdDtm) {
        this.createdDtm = createdDtm;
    }

    /**
     * User transaction datetime
     * <p>
     * The datetime the external vendor user created the transaction
     * 
     */
    @JsonProperty("userTransactionDtm")
    public Date getUserTransactionDtm() {
        return userTransactionDtm;
    }

    /**
     * User transaction datetime
     * <p>
     * The datetime the external vendor user created the transaction
     * 
     */
    @JsonProperty("userTransactionDtm")
    public void setUserTransactionDtm(Date userTransactionDtm) {
        this.userTransactionDtm = userTransactionDtm;
    }

    /**
     * Requested Amount
     * <p>
     * Used for settling transactions in external vendor
     * 
     */
    @JsonProperty("rqAmt")
    public Double getRqAmt() {
        return rqAmt;
    }

    /**
     * Requested Amount
     * <p>
     * Used for settling transactions in external vendor
     * 
     */
    @JsonProperty("rqAmt")
    public void setRqAmt(Double rqAmt) {
        this.rqAmt = rqAmt;
    }

    /**
     * Approval Code
     * <p>
     * The approval code for the transaction in external vendor
     * 
     */
    @JsonProperty("apprCode")
    public String getApprCode() {
        return apprCode;
    }

    /**
     * Approval Code
     * <p>
     * The approval code for the transaction in external vendor
     * 
     */
    @JsonProperty("apprCode")
    public void setApprCode(String apprCode) {
        this.apprCode = apprCode;
    }

    /**
     * Response
     * <p>
     * Object containing the response code and memo from external vendor
     * 
     */
    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    /**
     * Response
     * <p>
     * Object containing the response code and memo from external vendor
     * 
     */
    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Transaction Network
     * <p>
     * Transaction Network
     * 
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * Transaction Network
     * <p>
     * Transaction Network
     * 
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Sub Network
     * <p>
     * Sub Network
     * 
     */
    @JsonProperty("subNetwork")
    public String getSubNetwork() {
        return subNetwork;
    }

    /**
     * Sub Network
     * <p>
     * Sub Network
     * 
     */
    @JsonProperty("subNetwork")
    public void setSubNetwork(String subNetwork) {
        this.subNetwork = subNetwork;
    }

    /**
     * Preceding Transaction Token
     * <p>
     * Preceding Transaction Token
     * 
     */
    @JsonProperty("precedingTrnToken")
    public String getPrecedingTrnToken() {
        return precedingTrnToken;
    }

    /**
     * Preceding Transaction Token
     * <p>
     * Preceding Transaction Token
     * 
     */
    @JsonProperty("precedingTrnToken")
    public void setPrecedingTrnToken(String precedingTrnToken) {
        this.precedingTrnToken = precedingTrnToken;
    }

    /**
     * Is Provisional Credit
     * <p>
     * Is this chargeback in a provisional credit flow
     * 
     */
    @JsonProperty("isProvCr")
    public Boolean getIsProvCr() {
        return isProvCr;
    }

    /**
     * Is Provisional Credit
     * <p>
     * Is this chargeback in a provisional credit flow
     * 
     */
    @JsonProperty("isProvCr")
    public void setIsProvCr(Boolean isProvCr) {
        this.isProvCr = isProvCr;
    }

    /**
     * Cashback amount
     * <p>
     * Cashback amount
     * 
     */
    @JsonProperty("cashbackAmt")
    public Double getCashbackAmt() {
        return cashbackAmt;
    }

    /**
     * Cashback amount
     * <p>
     * Cashback amount
     * 
     */
    @JsonProperty("cashbackAmt")
    public void setCashbackAmt(Double cashbackAmt) {
        this.cashbackAmt = cashbackAmt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(msgType).append(acqNetCode).append(procNetCode).append(acqInstId).append(acqInstCntry).append(acqName).append(fwdInstId).append(fwdInstCntry).append(merchantCode).append(acceptorId).append(terminalId).append(threadId).append(acceptor).append(cardNbr).append(seqNbr).append(expireDtm).append(pin).append(verCode).append(acctType1).append(acctType2).append(captureDtm).append(xmitDtm).append(settleDtm).append(trnType).append(trnAmt).append(trnFee).append(procFee).append(ccyCode).append(custAmt).append(custFee).append(fxCust).append(fxSettle).append(panEntry).append(pinEntry).append(payee).append(authId).append(authCode).append(authExpDtm).append(responseCode).append(reasonCodes).append(posStatus).append(posGeo).append(addStar2).append(token).append(userToken).append(businessToken).append(actingUserToken).append(cardToken).append(trnTypeDesc).append(state).append(dur).append(createdDtm).append(userTransactionDtm).append(rqAmt).append(apprCode).append(response).append(network).append(subNetwork).append(precedingTrnToken).append(isProvCr).append(cashbackAmt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Eft) == false) {
            return false;
        }
        Eft rhs = ((Eft) other);
        return new EqualsBuilder().append(msgType, rhs.msgType).append(acqNetCode, rhs.acqNetCode).append(procNetCode, rhs.procNetCode).append(acqInstId, rhs.acqInstId).append(acqInstCntry, rhs.acqInstCntry).append(acqName, rhs.acqName).append(fwdInstId, rhs.fwdInstId).append(fwdInstCntry, rhs.fwdInstCntry).append(merchantCode, rhs.merchantCode).append(acceptorId, rhs.acceptorId).append(terminalId, rhs.terminalId).append(threadId, rhs.threadId).append(acceptor, rhs.acceptor).append(cardNbr, rhs.cardNbr).append(seqNbr, rhs.seqNbr).append(expireDtm, rhs.expireDtm).append(pin, rhs.pin).append(verCode, rhs.verCode).append(acctType1, rhs.acctType1).append(acctType2, rhs.acctType2).append(captureDtm, rhs.captureDtm).append(xmitDtm, rhs.xmitDtm).append(settleDtm, rhs.settleDtm).append(trnType, rhs.trnType).append(trnAmt, rhs.trnAmt).append(trnFee, rhs.trnFee).append(procFee, rhs.procFee).append(ccyCode, rhs.ccyCode).append(custAmt, rhs.custAmt).append(custFee, rhs.custFee).append(fxCust, rhs.fxCust).append(fxSettle, rhs.fxSettle).append(panEntry, rhs.panEntry).append(pinEntry, rhs.pinEntry).append(payee, rhs.payee).append(authId, rhs.authId).append(authCode, rhs.authCode).append(authExpDtm, rhs.authExpDtm).append(responseCode, rhs.responseCode).append(reasonCodes, rhs.reasonCodes).append(posStatus, rhs.posStatus).append(posGeo, rhs.posGeo).append(addStar2, rhs.addStar2).append(token, rhs.token).append(userToken, rhs.userToken).append(businessToken, rhs.businessToken).append(actingUserToken, rhs.actingUserToken).append(cardToken, rhs.cardToken).append(trnTypeDesc, rhs.trnTypeDesc).append(state, rhs.state).append(dur, rhs.dur).append(createdDtm, rhs.createdDtm).append(userTransactionDtm, rhs.userTransactionDtm).append(rqAmt, rhs.rqAmt).append(apprCode, rhs.apprCode).append(response, rhs.response).append(network, rhs.network).append(subNetwork, rhs.subNetwork).append(precedingTrnToken, rhs.precedingTrnToken).append(isProvCr, rhs.isProvCr).append(cashbackAmt, rhs.cashbackAmt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
