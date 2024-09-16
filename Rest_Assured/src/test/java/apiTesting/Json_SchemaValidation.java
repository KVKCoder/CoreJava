package apiTesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import org.testng.annotations.Test;

public class Json_SchemaValidation {
	
	
	public Json_SchemaValidation() {
		baseURI = "https://reqres.in/";
	}
		
		@Test
		public void getRequest() {

			given().get(baseURI+"api/users?page=2").then().statusCode(200).assertThat().body(matchesJsonSchema("schema.json"));
		}

}
