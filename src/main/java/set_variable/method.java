package set_variable;

import javax.annotation.Nullable;

import static io.restassured.RestAssured.given;

public class method {
    //------------------METHOD
    //GET
    public static String getMethod(String requestHeader, String requestParam, String requestPath) {
        String get = given().log().all()
                .header("Content-type",requestHeader)
                .queryParam(requestParam)
                .when().get(requestPath)
                .then().log().all()
                .assertThat().statusCode(200).extract().response().toString();
        return get;
    }
    //POST
    public static String postMethod(String requestHeader, @Nullable String requestParam, String requestBody, String requestPath) {
        String post = given().log().all()
                .header("Content-type",requestHeader)
                .queryParam(requestParam)
                .body(requestBody)
                .when().post(requestPath)
                .then().log().all()
                .assertThat().statusCode(200).extract().response().toString();
        return post;
    }
}
