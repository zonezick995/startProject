package API_tcs;
import io.restassured.path.json.JsonPath;

import set_variable.*;
import data_params.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class addBook {
    @DataProvider(name = "bookData")
    public Object[][] getData(){
        // array = collection of elements
        // multidimensional array = collection of arrays
        return new Object[][]{{"haha","123u7ss8"}};
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

        //Parse JSON
        JsonPath js = new JsonPath(res_addbook);
        String id = js.getString("ID");
        System.out.println("==> ID book =========== "+ id);
    }
}