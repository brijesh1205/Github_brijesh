package restassured.restassuredd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeaderTest {
  @Test
void header()
{
	given().
	
	when()
	.get("https://github.com/")
	
	.then()
	.header("Server", "GitHub.com")
	.header("Date", "Wed, 24 Jan 2024 14:55:05 GMT");
}
}

 /*@Test(priority=2)
void headervar()
{
	Response header_var =given()
	
	.when()
	.get("https://github.com/");
	
	String header_value=header_var.header("Server");
System.out.println("value of header is==> "+header_value);
	
	
}
}*/
	

