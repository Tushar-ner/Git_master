package SerializationandDserialization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo_Complexjson.Data;
import pojo_Complexjson.mainPojo;

import  static io.restassured.RestAssured.*;

import java.util.List;

public class PojoUser {
	
	@Test
	
	public void get_PoJoUser()

	{
		
		RestAssured.baseURI="https://reqres.in";
		mainPojo output=given()
		
		.when()
		.get("/api/users?page=2")
		.then()
		.log().all()
		.extract()
		.response().as(mainPojo.class);
		
		
		 Integer noofTotal_pages = output.getTotal_pages();
		System.out.println("Total_pages"+noofTotal_pages);
		
		System.out.println("***************************************");
		List<Data> datavalue=output.getData();
		 String email0 = datavalue.get(0).getEmail();
		System.out.println("eamail of first user:"+email0);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
