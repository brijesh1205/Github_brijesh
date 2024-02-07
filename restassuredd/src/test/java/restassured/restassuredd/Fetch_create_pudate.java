package restassured.restassuredd;

import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


 public class Fetch_create_pudate {
 
	
	@Test (priority=1)
	void fetchdata()
	{
		given()
		
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.log().all();
	}

	@Test (priority=2)
		void createdata()
		{
		
		JSONObject brijesh = new JSONObject();
		brijesh.put("name", "subham");
		brijesh.put("job", "trainer");
		
		
			given()
			.contentType("application/json")
			.body(brijesh.toString())
			
			.when()
			.post("https://reqres.in/api/users")
			
			
			.then()
			.statusCode(201)
			.log().all();
		}
	@Test (priority=3)
	void updatedata()
	{
		JSONObject brijesh = new JSONObject();
		brijesh.put("name", "Brijesh");
		brijesh.put("job", "Testing");
		
		
			given()
			.contentType("application/json")
			.body(brijesh.toString())
			
			.when()
			.put("https://reqres.in/api/users/2")
			
			
			.then()
			.statusCode(200)
			.log().all();
		
			
	}
}
