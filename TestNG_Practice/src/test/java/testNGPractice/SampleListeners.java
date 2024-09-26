package testNGPractice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SampleListeners {
	
	@Test (description = "I have provided Description for the test1") 
	public void test1() {
		System.out.println("This is inside Test1");
		System.out.println("----------------------");
	}

	@Test (priority=-1, description = "I have provided Description for the test2")
	public void test2() {
		System.out.println("This is inside Test2");
		System.out.println("----------------------");
	}
	
	@Test
	public void test3() {
		System.out.println("This is inside Test3");
		System.out.println("----------------------");
	}

	
	@Test
	public void test4() {
		Assert.assertTrue(true, "Assertion Failed for Test4");
		throw new SkipException("Skipping the Test4");
	}


}
