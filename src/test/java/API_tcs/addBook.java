package API_tcs;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import set_variable.*;
import data_params.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class addBook {
    @DataProvider(name = "bookData")
    public Object[][] getData(){
        // array = collection of elements
        // multidimensional array = collection of arrays
        return new Object[][]{{"312321","8473289754"}};
    }
    @Test(dataProvider = "bookData")
    public static void addBook(String isbn, String aisle){
        // DOMAIN
        RestAssured.baseURI=(commonVar.url);
        //Start request
        String res_addbook = method.postMethod("text/plain","",
                requestParams.addbook_Payload(isbn,aisle),
                commonVar.path_addbook);
        //End request
        JsonPath res = func.rawToJson(res_addbook);
        System.out.println(res);
//        String id = res.getString("ID");
//        System.out.println("==> ID book =========== "+ id);
    }
}