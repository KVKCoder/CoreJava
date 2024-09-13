package apiTesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

public class PUTPATCHDELETE_RequestProgram {

	public PUTPATCHDELETE_RequestProgram() {
		baseURI = "https://reqres.in/";
	}

	@Test
	public void PUT_Request() {

		Map<String, Object> mapValue = new HashMap<String, Object>();

		mapValue.put("name", "KVK");
		mapValue.put("job", "QA Engineer");

		System.out.println(mapValue);

		JSONObject test_Json = new JSONObject(mapValue);

		given().body(test_Json).when().put("api/users/2").then().statusCode(200).log().all();

	}

	
	@Test
	public void PATCH_Request() {

		Map<String, Object> mapValue = new HashMap<String, Object>();

		mapValue.put("name", "KVK");
		mapValue.put("job", "QA Engineer");

		System.out.println(mapValue);

		JSONObject test_Json = new JSONObject(mapValue);

		given().body(test_Json).when().patch("api/users/2").then().statusCode(200).log().all();

	}
	
	
	@Test
	public void DELETE_Request() {
		given().when().delete("api/users/2").then().statusCode(204);
	}
	
}
