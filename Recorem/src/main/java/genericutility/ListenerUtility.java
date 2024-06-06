package genericutility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUtility extends BaseClass implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("asdfghjkl;lkjhg",true);
		
		
	}

	
}
