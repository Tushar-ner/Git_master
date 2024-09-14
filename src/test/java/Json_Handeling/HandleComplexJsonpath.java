package Json_Handeling;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class HandleComplexJsonpath {
	
	@Test
	public void handleComplexjson() {
		
JsonPath js=new JsonPath(ComplexJsonBody.getComplexJsonData());

// json >>map,hashmap
// array>> list ,arraylist

Map< String, Object>mainobject=new HashMap<String,Object>(); 

// creating  dashboard object from main object 
//first key and value pair of json

Map< String, Object>dashboardobject=new HashMap<String,Object>();

mainobject.put("dashboard", dashboardobject);

// Adding value in dashboard object

dashboardobject.put("purchaseAmount", 910);
dashboardobject.put("website", "www.abc.com");

//creating  course object from main object 
//second key and value pair of json

List<Object>coursesobject=new ArrayList<Object>();
mainobject.put("courses", coursesobject);

// adding value in courseobject

Map< String,Object>firstobject =new HashMap<String,Object>();
firstobject.put("Title", "Selenium python");
firstobject.put("price", 60);
firstobject.put("copies", 6);

Map< String,Object>secondobject =new HashMap<String,Object>();
secondobject.put("Title", "cypress");
secondobject.put("price", 40);
secondobject.put("copies", 4);

Map< String,Object>thirdobject =new HashMap<String,Object>();
thirdobject.put("Title", "Rpa");
thirdobject.put("price", 45);
thirdobject.put("copies", 10);

System.out.println("**********************************");


// print the no of courses returned by json api
int noofcourses=js.getInt("coursesobject.size()");
System.out.println("no of courses are "+noofcourses);

System.out.println("**********************************");


// print purchase amount from json
int purchaseAmountValue=js.getInt("dashboard.purchaseAmout");
System.out.println("printing purchase amount"+purchaseAmountValue);

System.out.println("**********************************");

// print the title of firstcourse 
String firstcourse=js.get("courses[0].title");
System.out.println("title of first course:"+firstcourse);

System.out.println("**********************************");


// print the title of every course and its resp copies 

int lengthofcourse= coursesobject.size();

for(int i=0;i<=lengthofcourse;i++) {
	String coursename=js.getString("courses["+i+"].title");
	int countcopies=js.getInt("courses["+i+"].copies");
	System.out.println("printig the title of every course and its resp copies");
	System.out.println(coursename+":"+countcopies);	
}
System.out.println("**********************************");

//print no. of copies sold by RPA course 

for(int i=0;i<=lengthofcourse;i++) {
	String coursetitle=js.getString("courses["+i+"].title");
	if(coursetitle.equals("RPA")) {
		int copiescount =js.getInt("courses["+i+"].copies");
		System.out.println("no. of copies sold by RPA course "+copiescount);	
		
	}
	}

// validate all course prices match with purchase amount

for(int j=0;j<=lengthofcourse;j++) {
	int copiesprice=js.getInt("courses["+j+"].copies");
    int expamount=js.getInt("dashboard.purchaseAmount");
    
    
if(expamount==copiesprice) {
	
	System.out.println("test pass amount is matching ");
}
    
	
	
	
}


	
	}
	

}