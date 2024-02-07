package restassured.restassuredd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class Fetchdata {

	@Test
	void getdata()
	{
		  
		
		given()
		
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.log().all();
	}

	@Test(priority=2)
	void createData()
	{
		  JSONObject object_name= new JSONObject();
		     object_name.Post("  \"id\": 7,\r\n"
		  		+ "            \"email\": \"michael.lawson@reqres.in\",\r\n"
		  		+ "            \"first_name\": \"Michael\",\r\n"
		  		+ "            \"last_name\": \"Lawson\",\r\n"
		  		+ "            \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"");
		
		given()
		
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.log().all();
	}

		
	}
	

