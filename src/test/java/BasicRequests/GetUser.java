package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GetUser {
	
	@Test
	
	public void GetUsers() {
		
		RestAssured.baseURI="https://reqres.in";
		
		Response response=given()
		.when()
		.get("/api/users/2")
		.then()
		.extract()
	    .response();
		 String output=response.asPrettyString();
		 System.out.println(output);
	}

	
	
	
	
	
	
		
}
