package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.baseTest;

public class myListner implements ITestListener {

	public void onTestFailure(ITestResult result) {

		String failedScriptName = result.getMethod().getMethodName();
		baseTest.actionUtil.captureScreenshot(failedScriptName);
	}
}
