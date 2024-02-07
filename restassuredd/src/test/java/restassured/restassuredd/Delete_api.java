package restassured.restassuredd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;




public class Delete_api {

	@Test
	void Delete_api()
	{
		JSONObject object_name = new JSONObject();
		object_name.put("name", "Brijesh");
		 object_name.put("job", "testing");
		
		given()
		
		.when()
		.delete("https://reqres.in/api/users/2")
		
		
		.then()
		.statusCode(204)
		.log().all();
		
		
	}
	
	
}
