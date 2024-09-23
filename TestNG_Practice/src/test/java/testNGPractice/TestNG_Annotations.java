package testNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	// ****BeforeTest and AfterTest Annotation****

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Annotation will be executed only once before the first test");
		System.out.println("----------------------");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation will be executed only once after the last test");
		System.out.println("----------------------");
	}

	// ****BeforeMethod and AfterMethod Annotation****

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation will be executed before the every test");
		System.out.println("----------------------");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation will be executed after the every test");
		System.out.println("----------------------");
	}

	@Test
	public void test1() {
		System.out.println("This is inside Test1");
		System.out.println("----------------------");
	}

	@Test
	public void test2() {
		System.out.println("This is inside Test2");
		System.out.println("----------------------");
	}

	@Test
	public void test3() {
		System.out.println("This is inside Test3");
		System.out.println("----------------------");
	}

}
