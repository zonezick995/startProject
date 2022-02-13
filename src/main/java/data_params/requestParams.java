package data_params;

public class requestParams {

    // Params addbook Json
    public static String addbook_Payload(String isbn, String aisle){
        String payload = "{\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foer\"\n" +
                "}\n";
        return payload;
    }

}
