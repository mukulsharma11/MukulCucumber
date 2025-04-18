package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Page;

//   user defined class..
public class ScreenShot extends Page
{
	// user defined method
	public static void takeScreenShot(String name) throws Exception
	{
		String path = System.getProperty("user.dir")+"//src//test//java//screenshot//"+name+".jpg";
	
		TakesScreenshot ts = (TakesScreenshot)driver; // TakesScreenshot is predefined interface from Selenium library
	    File tmp = ts.getScreenshotAs(OutputType.FILE); // take screenshot and stores in tmp location
	
	    FileUtils.copyFile(tmp, new File(path)); // copy file from tmp location to path location
	
	}

}
