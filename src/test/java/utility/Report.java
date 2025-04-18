package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report 
{
     // global variable..
	
	public static ExtentReports report = null;
	public static ExtentSparkReporter reporter = null;
	public static ExtentTest test = null;
	
	public static void generateReport(String reportname,String testname)
	{
		String path = System.getProperty("user.dir")+"//src//test//java//report//"+reportname+".html";
		
		report = new ExtentReports();
		
		reporter = new ExtentSparkReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle(testname);
		reporter.config().setReportName(reportname);
		
		report.attachReporter(reporter);
		
		test = report.createTest(testname);
	}
}
