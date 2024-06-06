package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnextentreports
{
	@Test
	public void reports()
	{
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/abcd.html");
	ExtentReports extReports = new ExtentReports();
	extReports.attachReporter(spark);
	ExtentTest test = extReports.createTest("reports");
	test.log(Status.PASS," log message added to extent report");
	extReports.flush();
	
		
		
	}
	
}
