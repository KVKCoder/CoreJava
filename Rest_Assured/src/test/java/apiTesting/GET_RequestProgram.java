package apiTesting;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GET_RequestProgram {
	
	
public GET_RequestProgram() {
	baseURI = "https://reqres.in/";
}
	
	@Test
	public void getRequest() {

	   

		given().get(baseURI+"api/users?page=2").then().statusCode(200).body("data[0].id", equalTo(7)).and().body("data[1].first_name", equalTo("Lindsay"));

	}

	
	@Test
	public void validateResponse() {
		
		given().get(baseURI+"api/users?page=2").then().body("data.first_name", hasItems("Michael", "Byron", "George"));
	}
	
	
}
