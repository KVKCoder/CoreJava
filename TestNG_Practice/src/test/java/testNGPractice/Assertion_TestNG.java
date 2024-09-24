package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG {
	
	@Test
	public void assertTrue() {
		Assert.assertTrue(false);
		System.out.println("Assertion Failed");
		
	}

}
