package restassured.restassuredd;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;




public class Post_api {


	@Test
	void createData ()
	{
		JSONObject object_name = new JSONObject();
		object_name.put("name", "Brijesh");
		object_name.put("job", "testing");
		
	given()
	.contentType("application/json")
	.body(object_name.toString())
	
	
	.when()
	.post("https://reqres.in/api/users")
	
	
	.then()
	.statusCode(201)
	.log().all();
		
		
	}
	
	
}
