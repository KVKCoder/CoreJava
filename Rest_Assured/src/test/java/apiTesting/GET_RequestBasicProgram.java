package apiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_RequestBasicProgram {

	@Test
	public void getRequest() {
		// TODO Auto-generated method stub

		Response res = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(res.getStatusCode());

		System.out.println(res.getTime());

		System.out.println(res.getBody().asPrettyString());
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
	}

}
