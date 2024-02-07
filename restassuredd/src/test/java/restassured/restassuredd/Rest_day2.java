package restassured.restassuredd;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;



public class Rest_day2 {
@Test(priority=1)
	void fetchuser1()
	{	
	
	given()
	
	
	.when()
	.get("https://reqres.in/api/users/2")
	
	.then()
	.statusCode(200)
	.log().all();
}	


@Test(priority=2)

void fetchuser2()
{
	given()
	
	.when()
	.get("https://reqres.in/api/users?page=2")
	
	.then()
	.statusCode(200)
	.log().all();
}
}


	
		
	
