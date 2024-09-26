package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TestNG {

	// **** First way of Defining DataProvider ****

	@DataProvider
	public Object[][] dataSet() {

		Object[][] dataInput = new Object[3][2];

		dataInput[0][0] = "Username1";
		dataInput[0][1] = "Password1";

		dataInput[1][0] = "Username2";
		dataInput[1][1] = "Password2";

		dataInput[2][0] = "Username3";
		dataInput[2][1] = "Password3";

		return dataInput;

	}

	@Test(dataProvider = "dataSet")
	public void test1(String Username, String Password) {
		System.out.println(Username + "======" + Password);
		System.out.println("------------------------------");
	}

	// **** Second way of Defining DataProvider ****

	@DataProvider(name = "InputData2")
	public Object[][] dataSet2() {
		return new Object[][] { { "UN1", "PW1" }, { "UN2", "PW2" }

		};
	}

	@Test(dataProvider = "InputData2")
	public void test2(String Username, String Password) {
		System.out.println("Inside the Test2");
		System.out.println(Username + "======" + Password);
		System.out.println("------------------------------");
	}

}
