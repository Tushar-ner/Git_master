package PetstoreSwagger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class AddPet {
	
	@Test
	
	public void Add_Pet() {
		
		RestAssured.baseURI="https://petstore.swagger.io";
	Response response	=given()
			.header("content-type","application/json")
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"bela\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}")
		.when()
		.post("/v2/pet")
		.then()
		.extract()
		.response();
String output	=response.asPrettyString();
System.out.println(output);
int respstatuscode=response.getStatusCode();
System.out.println(respstatuscode);

JsonPath js = response.jsonPath();
int id=js.getInt("id");
System.out.println(id);

String name=js.get("name");
System.out.println(name);
	


		
	}

}
