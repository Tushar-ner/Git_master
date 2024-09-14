package assignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;
public class FetchResposeHeader {
	
	@Test
	public void getHeader() {
		
		RestAssured.baseURI="https://api.getpostman.com";
	Response response=given()
	.header("x-api-key","PMAK-669fbe6ad8673400018be16a-b9b4f8a67fbcac9da8520a7fa0c7b223cf")
	.when()
    .get("/workspaces")
	.then()
	.extract()
	.response();
	String output=response.asPrettyString();
	System.out.println(output);
	
	Headers header = response.headers();
	 List<Header> listofHeaders = header.asList();
	Header firstheader=listofHeaders.get(2);
	System.out.println(firstheader);
	
	
	
		
	}

}
