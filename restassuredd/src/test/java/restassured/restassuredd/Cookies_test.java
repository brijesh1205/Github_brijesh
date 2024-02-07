package restassured.restassuredd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse;


public class Cookies_test {
	
/*	@Test(priority=1)
	void cookie_demo()
	{
		
		given()
		
		.when()
		.get("https://www.facebook.com/")
		
		.then()
		.cookie("fr", "0kQ1Ezu9gQribSBCL..BlsQ1p.4p.AAA.0.0.BlsQ1p.AWUmV5wW6AY")
		.log().all(); 
	}		
}*/

  @Test(priority=2)
void cookieVar()
{
	Response res = given()
	
	.when()
	.get("https://www.facebook.com/");
	
	//get single cookie info
    String cookie_value= res.cookie("fr");
    System.out.println("Value of cookie is===>"+cookie_value);
    
   // get multiple cookie  prient
    
    
}
	}