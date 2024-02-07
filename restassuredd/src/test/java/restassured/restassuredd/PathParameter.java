package restassured.restassuredd;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathParameter {

	
	
	
@Test	
void QueryParameter () {
	
	given()
	.pathParam("path_parameter_1", "api")
	.pathParam("path_parameter_2", "users")
	.queryParam("page", 2)
	
	
	.when()
	.get("https://reqres.in/{path_parameter_1}/{path_parameter_2}")
	
	.then()
	.log().all();
}
	
}
