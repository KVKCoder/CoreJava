package apiTesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

public class POST_RequestProgram {

	public POST_RequestProgram() {
		baseURI = "https://reqres.in/";
	}

	@Test
	public void PUT_Request() {

		Map<String, Object> mapValue = new HashMap<String, Object>();

		mapValue.put("name", "KVK");
		mapValue.put("job", "QA Engineer");

		System.out.println(mapValue);

		JSONObject test_Json = new JSONObject(mapValue);

		given().body(test_Json).when().post("api/users").then().statusCode(201).log().all();

	}

}
