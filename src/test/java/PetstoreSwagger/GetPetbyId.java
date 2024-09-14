package PetstoreSwagger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;


public class GetPetbyId {
	
	@Test
	
	public void getPet() {
		
		RestAssured.baseURI="https://petstore.swagger.io";
		Response response=given()
				.when()
				.get("/v2/pet/9223372016900020721")
				.then()
				.extract()
				.response();
		String output=response.asPrettyString();
		System.out.println(output);
		
		JsonPath js=response.jsonPath();
		int id=js.getInt("id");
		System.out.println(id);
String petname=js.getString("name");
System.out.println(petname);
		
	}

}
