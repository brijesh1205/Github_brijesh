package restassured.restassuredd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Pathparm2 {

	
	
	@Test
	void pathdemo()
	{
		
		given()
		.pathParam("path_param_1", "api")
		.pathParam("path_param_2", "users")
		.queryParam("page", 2)
		.when()
		.get("https://reqres.in/{path_param_1}/{path_param_2}")
		
		.then()
		.log().all();
	}

 @Test(priority=2)
	void cookies()
	{
		
		Response res=given()
		
		
		.when()
		.get("https://github.com/");
		
	String cookie_val=res.getCookie("_gh_sess");
	System.out.println("This is the cookie value"     +cookie_val);
	
	
	}
 @Test(priority=3)
	void headertest()
	{
		
		Response res=given()
		
		
		.when()
		.get("https://github.com/");
		
	String Header_val=res.getHeader("Vary");
	System.out.println("This is the header  value"     +Header_val);
	
	}
	}