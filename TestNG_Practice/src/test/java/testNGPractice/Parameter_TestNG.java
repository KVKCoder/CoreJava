package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_TestNG {

	
	@Parameters({"TestParameter"})
	@Test
	public void test1(String TestParameter) {
		System.out.println("This is inside Test1");
		System.out.println("----------------------");
		
//		Assert.assertTrue(TestParameter.equals("Browsers"),"Passing Parameter through TestNG File is not expected");
		
		System.out.println("The given Parameter in the TestNG.XML is " + TestParameter);
		
		Assert.assertEquals(TestParameter, "Browser", "Not a correct Parameter");
		
		
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("This is inside Test2");
		System.out.println("----------------------");
	}

	@Test (enabled = false)
	public void test3() {
		System.out.println("This is inside Test3");
		System.out.println("----------------------");
	}

}
