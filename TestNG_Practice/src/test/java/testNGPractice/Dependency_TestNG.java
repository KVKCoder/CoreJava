package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_TestNG {
	
	@Test (description = "I have provided Description for the test1", dependsOnMethods = "test2", alwaysRun = true) 
	public void test1() {
		System.out.println("This is inside Test1");
		System.out.println("----------------------");
	}

	@Test (priority=-1, description = "I have provided Description for the test2")
	public void test2() {
		Assert.assertTrue(false, "Fail this Test2");
		System.out.println("This is inside Test2");
		System.out.println("----------------------");
	}
	
	@Test
	public void test3() {
		System.out.println("This is inside Test3");
		System.out.println("----------------------");
	}


}
