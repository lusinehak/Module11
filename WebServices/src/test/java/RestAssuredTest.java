import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import user.User;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    @BeforeTest()
    public void init() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/users";
    }

    @Test()
    public void verifyStatusCode() {
        Response response = given().get().andReturn();
        int actualStatusCode = response.getStatusCode();
        System.out.println(actualStatusCode);
        Assert.assertEquals(actualStatusCode, 200);
    }

    @Test()
    public void verifyResponseHeader() {
        Response response = given().get("").andReturn();
        String contentTypeValue = response.getHeader("content-type");
        Assert.assertTrue(contentTypeValue.contains("application/json"));
        Assert.assertTrue(contentTypeValue.contains("charset=utf-8"));
    }

    @Test
    public void VerifyResponseBodyLength() {
        Response response = given().get("").andReturn();
        User[] user = response.as(User[].class);
        Assert.assertEquals(user.length, 10);
    }
}
