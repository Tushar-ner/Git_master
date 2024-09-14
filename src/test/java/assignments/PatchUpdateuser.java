package assignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import  static io.restassured.RestAssured.*;
public class PatchUpdateuser {

	@Test
	public void updateuserPatch() {
		
		RestAssured.baseURI="https://reqres.in/";
		Response response = given()
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
		.when()
		.patch("/api/users/2")
		.then()
		.extract()
		.response();
String output=response.asPrettyString();
System.out.println(output);
		
				
	}
}
