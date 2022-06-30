package testclasses;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Api_test {
      @Test
      public void m1()
      {
	given()
		.param("page","2")
		.auth().oauth2("")
	    .header("Content-Type","application/JSON")
		.header("accept","application/JSON")
     .when()
        .get("https://reqres.in/api/users?page=2")
      .then()
        .statusCode(200)
        .body("data.id[0]", equalTo(7))
        .body("data.id[1]", equalTo(8))
        .log().all();
	}
}
