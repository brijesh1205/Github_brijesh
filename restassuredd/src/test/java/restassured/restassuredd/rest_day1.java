package restassured.restassuredd;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;




public class rest_day1 {

	
	//given{}
	
	
	//when{}
	
//then{}
	
@Test
void fetchuser()
{	

	given()
	
	
	.when()
	.get("https://reqres.in/api/users?page=2")
	
	.then()
     .assertThat().statusCode(200);
     
     
     
     
     
     
		
	
		

	}


		
	}

	
		
	
		
	
