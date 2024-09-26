package testNGPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_TestNG implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started -  Listener");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Completed Successfully -  Listener");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed -  Listener");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped -  Listener");
	}

}
