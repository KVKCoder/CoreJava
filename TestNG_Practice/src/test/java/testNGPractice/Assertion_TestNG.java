package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG {
	
	@Test (enabled = false)
	public void assertTrue() {
		Assert.assertTrue(false);
		System.out.println("Assertion Failed");
		
	}

	@Test (invocationCount = 5)
	public void assertMessage() {
		Assert.assertTrue(true);
		System.out.println("Assertion True");
		
	}
	
	
	@Test
	public void assertWithMessage() {
		Assert.assertEquals("QA", "QA", "Assertion message is displayed");
		System.out.println("Assertion True and message in console");
		
	}
	
	
}
