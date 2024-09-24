package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
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

	// ****BeforeClass and AfterClass Annotation****

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Annotation will be executed before the First test in the current class");
		System.out.println("----------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation will be executed after all the test in the current class");
		System.out.println("----------------------");
	}

	// ****BeforeGroups and AfterGroups Annotation****

	@BeforeGroups(value = "SmokeGroup")
	public void beforeGroup() {
		System.out.println("Before Group Annotation will be executed before the First test in the Group");
		System.out.println("----------------------");
	}

	@AfterGroups(value = "SmokeGroup")
	public void afterGroup() {
		System.out.println("After Group Annotation will be executed after all the test in the Group");
		System.out.println("----------------------");
	}

	// ****BeforeSuite and AfterSuite Annotation****

	@BeforeSuite
	public void beforeSuitep() {
		System.out.println("Before Suite Annotation will be executed before all the tests");
		System.out.println("----------------------");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Before Suite Annotation will be executed after all the tests");
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

	@Test(groups = "RegressionGroup")
	public void groupTest1() {
		System.out.println("This is inside Regression groupTest1");
		System.out.println("----------------------");
	}

	@Test(groups = "RegressionGroup")
	public void groupTest2() {
		System.out.println("This is inside Regression groupTest2");
		System.out.println("----------------------");
	}

	@Test(groups = "SmokeGroup")
	public void groupTest3() {
		System.out.println("This is inside Smoke groupTest3");
		System.out.println("----------------------");
	}

	@Test(groups = "SmokeGroup")
	public void groupTest4() {
		System.out.println("This is inside Smoke groupTest4");
		System.out.println("----------------------");
	}

}
