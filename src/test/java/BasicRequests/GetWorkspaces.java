package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import  static io.restassured.RestAssured.*;

public class GetWorkspaces {
	
	@Test
	public void getWorkspace() {
		RestAssured.baseURI="https://api.getpostman.com";
		
		Response response=given()
	.when()
	.header("x-api-key","PMAK-669fbe6ad8673400018be16a-b9b4f8a67fbcac9da8520a7fa0c7b223cf")
	.get("/workspaces")
	.then()
	.extract()
	.response();
	 String result=response.asPrettyString();
	 System.out.println(result);
	
	
		
		
	}

}
