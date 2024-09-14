package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class GetUserList {

	
	
	@Test
	public void getUserList() {
		RestAssured.baseURI="https://reqres.in/";
		
		Response response=given()
		.when()
		.get("/api/users?page=2")
		.then()
		.extract()
		.response();
	String output=	response.asString();
	
	System.out.println(output);
		
	}
	
	
	
}
