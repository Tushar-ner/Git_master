package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class PostUserCreate {

	
	@Test
	public void userCreate() {
		
	RestAssured.baseURI="https://reqres.in";
	
	Response response = given()
	.body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}")
	.when()
	.post("api/users")	
	.then()
	.extract()
	.response();
	response.asPrettyString();
	
String output	=response.asPrettyString();
System.out.println(output);
int statuscode=response.getStatusCode();
System.out.println("responce status code is "+statuscode);

long time=response.getTime();
System.out.println("response time is "+time);
		

		
	}
	}
