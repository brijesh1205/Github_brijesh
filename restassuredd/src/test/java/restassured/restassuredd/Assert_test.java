package restassured.restassuredd;

import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Assert_test {

	
	@Test
	void assertDemo()
	{
	
		
		when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("data[0].id", equalTo(7));
		}		
	
	
void assertDemo1()
{

	
	when()
	.get("https://reqres.in/api/users?page=2")
	
	.then()
	

	}		
}
	
	
	

