package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Api_Post {
	
	@Test
	public void Test_Post()
	{
		JSONObject request=new JSONObject();
		request.put("name","rashmi1");
		request.put("job","tester1");
		
		
	Response res=given()
		.header("accept","Application/JSON")
		.header("Content-Type","Application/JSON")
		.auth().none()
		.body(request.toJSONString())
	.when()
		.post("https://reqres.in/api/users")
		
	.then()
		.statusCode(201)
		.log().all()
		.extract().response();
	   String jsonString=res.asString();
  Assert.assertEquals(jsonString.contains("Request added successfully"),true);
	}
		
	@Test
	public void Test_Put()
	{
       JSONObject request1=new JSONObject();
       request1.put("name","ankush");
       request1.put("job", "data scientist");
       
       given()
       .header("accept","Application/JSON")
		.header("Content-Type","Application/JSON")
		.auth().none()
		.body(request1.toJSONString())
	.when()
	   .put("https://reqres.in/api/users/2")
	   
	 .then()
	 .statusCode(200)
	 .time(lessThan(1500L))
	 .log().all();
		
	
	}
	
	@Test
	public void Test_delete()
	{
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
