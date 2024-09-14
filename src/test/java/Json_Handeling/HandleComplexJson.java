package Json_Handeling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class HandleComplexJson {
	
	@Test
	public void handlejson() {
		
		JsonPath js=new JsonPath(BodyComplexjson.complexjsonBody());
		
		// json >>map,hashmap
		// array>> list ,arraylist
		
		List<Object>zeromainobject=new ArrayList<Object>();
		
		
		
		Map<String ,Object>zeroobject=new HashMap<String ,Object>();
		zeroobject.put("id", 0001);
		zeroobject.put("type","donut");
		zeroobject.put("name","cake");
		zeroobject.put("ppu",0.55);
		
		// adding zeroobject value in zeromain object
		zeromainobject.add(zeroobject); 
		
		//main object batters
		Map<String, Object>battersmainobject =new HashMap<String, Object>();
		
		
		// array better
		List < Object> batterobject=new ArrayList< Object>();
		
		Map<String, Object>zeroobjectbatter=new HashMap<String, Object>();
		zeroobjectbatter.put("id", 1001);
		zeroobjectbatter.put("Type", "regular");
		
		Map<String, Object>firstobjectbatter=new HashMap<String, Object>();
		firstobjectbatter.put("id", 1002);
		firstobjectbatter.put("Type", "chocolate");
		
		Map<String, Object>secondobjectbatter=new HashMap<String, Object>();
		secondobjectbatter.put("id", 1003);
		secondobjectbatter.put("Type", "blueberry");
		
		Map<String, Object>thirdobjectbatter=new HashMap<String, Object>();
		thirdobjectbatter.put("id", 1004);
		thirdobjectbatter.put("Type","devils food" );
		
		// adding all the first object,second object,third object to  object batter
 
		
		 batterobject.add(zeroobjectbatter);
		 batterobject.add(firstobjectbatter);
		 batterobject.add(secondobjectbatter);
		 batterobject.add(thirdobjectbatter);
		
		// adding all the batter values in main object batters 
		 battersmainobject.put("batter", batterobject); 
		
		
		
		// array Topping
		
				List < Object> Toppingmainobject=new ArrayList< Object>();
				
				Map <String ,Object>zeroobjectTopping=new HashMap<String ,Object>();
				zeroobjectTopping.put("id",5001 );
				zeroobjectTopping.put("type", "none");
				
		
				Map <String ,Object>firstobjectTopping=new HashMap<String ,Object>();
				firstobjectTopping.put("id", 5002);
				firstobjectTopping.put("type", "glazed");
		
				Map <String ,Object>secondobjectTopping=new HashMap<String ,Object>();
				secondobjectTopping.put("id", 5003);
				secondobjectTopping.put("type", "sugar");
		
				Map <String ,Object>thirdobjectTopping=new HashMap<String ,Object>();
				thirdobjectTopping.put("id", 5004);
				thirdobjectTopping.put("type", "Powdered Sugar");
				
				Toppingmainobject.add(zeroobjectTopping);
				Toppingmainobject.add(firstobjectTopping);
				Toppingmainobject.add(secondobjectTopping);
				Toppingmainobject.add(thirdobjectTopping);
		
			
		
	//	Adding batters and topping values in main object zero 
				zeromainobject.add(battersmainobject);
				zeromainobject.add(Toppingmainobject);
		
				
				
		//// creating first main list 
			List<Object>firstmainobject=new ArrayList<Object>();
			
			Map<String ,Object>firstobject=new HashMap<String ,Object>();
			firstobject.put("id",0002 );
			firstobject.put("type","donut" );
			firstobject.put("name", "raised");
			firstobject.put("ppu",0.55 );
			
			List<Object>firstobjcetbatters1=new ArrayList<Object>();
			
			// created object batter and adding value in it
			Map<String ,Object>batter0=new HashMap<String ,Object>();
			
			batter0.put("id", 1001);
			batter0.put("type", "regular");
			
			
			firstobjcetbatters1.add(batter0);
			firstmainobject.add(firstobjcetbatters1);
			
			
			List<Object>firstobjecttopping=new ArrayList<Object>();
			
			
			Map<String,Object>zeroobjecttop=new HashMap<String,Object>();
						zeroobjecttop.put("id", 5001);
						zeroobjecttop.put("type", "none");

				
						Map<String,Object>firstobjecttop=new HashMap<String,Object>();
						firstobjecttop.put("id", 5002);
						firstobjecttop.put("type", "glazed");

						Map<String,Object>secondobjecttop=new HashMap<String,Object>();
						secondobjecttop.put("id", 5005);
						secondobjecttop.put("type", "sugar");

						firstobjecttopping.add(zeroobjecttop);
						firstobjecttopping.add(firstobjecttop);
						firstobjecttopping.add(secondobjecttop);
						
						firstmainobject.add(firstobjecttopping);
		
	}

}
