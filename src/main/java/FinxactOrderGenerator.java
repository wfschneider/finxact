import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finxact.model.Order;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FinxactOrderGenerator {


    public static String getJSONString(Object order) {

        String jsonOutput = null;

        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(order);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonOutput;
    }
}
