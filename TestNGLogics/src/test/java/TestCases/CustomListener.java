package TestCases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Falied Test");
		failed(result.getMethod().getMethodName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}
	
	

}
