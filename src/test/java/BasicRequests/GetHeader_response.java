package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.List;

public class GetHeader_response {

	@Test
	public void GetHeaderfromResponse() {
		
		
		RestAssured.baseURI="https://api.getpostman.com";
Response response=given()
		.when()
		.header("x-api-key","PMAK-669fbe6ad8673400018be16a-b9b4f8a67fbcac9da8520a7fa0c7b223cf")
		.get("/workspaces")
		.then()
		.extract()
		.response();
		response.asPrettyString();
	System.out.println("Fetch single header from list ");
	
   Headers header=response.headers();
   List<Header>headers=header.asList();
   Header firstheader=headers.get(0);
   System.out.println(firstheader);
System.out.println("*****************************");

System.out.println("print all headers");

Headers allheader = response.headers();
String header1=allheader.toString();
System.out.println(header1);
	}
}
