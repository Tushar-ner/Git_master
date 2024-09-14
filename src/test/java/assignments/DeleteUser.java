package assignments;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
 import io.restassured.response.Response;


import  static io.restassured.RestAssured.*;
public class DeleteUser {
	
	@Test
	public void userdelt() {
		RestAssured.baseURI="https://reqres.in/";
		
	Response response=	 given()     
		
		.when()
		.delete("api/users/2")
		.then()
		.extract()
        .response();
 String output =response.asPrettyString();
 System.out.println(output);
 
 int actstatuscode=response.getStatusCode();
 int expstatuscode=204;
 assertEquals(expstatuscode,actstatuscode);
 
 
 
 
// if(actstatuscode==expstatuscode) {
//	 
//	 
//	 
//	 System.out.println("Test pass");
// }
// else {
//  System.out.println("Test fail");
// }
       
	
		
		
	}

}
