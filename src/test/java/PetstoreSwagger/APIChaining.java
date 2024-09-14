package PetstoreSwagger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
public class APIChaining {
	
	
	@Test
	public void create_user() {
		RestAssured.baseURI="";
	Response response=	given()
		.when()
		.post("")
		.then()
		.extract()
		.response();
		
		
		
		
	}

}
