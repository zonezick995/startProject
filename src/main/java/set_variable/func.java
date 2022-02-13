package set_variable;

import io.restassured.path.json.JsonPath;

public class func {

    public static JsonPath rawToJson(String response){
        JsonPath js = new JsonPath(response);
        System.out.println("run method rawToJson");
        return js;
    }
}
