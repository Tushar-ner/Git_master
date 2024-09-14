package assignments;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;

import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class PutUpdateUser {
	@Test
	public void updateUser() {
		RestAssured.baseURI="https://reqres.in/";
		Response response =given()
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
				.when()
				.put("api/users/2")
				.then()
				.extract()
				.response();
		response.asPrettyString();
		
		
	Headers  resheader=	response.getHeaders();
	System.out.println(resheader);
	
	 int actstatuscode=response.getStatusCode();
	 System.out.println("Response status code is "+actstatuscode);
	 int expstatuscode= 200;
assertEquals(expstatuscode, actstatuscode);
	 
		
	}
	
	

}
