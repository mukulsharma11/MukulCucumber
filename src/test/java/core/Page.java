package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class Page 
{
    // global var
	public static WebDriver driver = null;
	
	public void openBrowser(String browser,String url)  // define
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			//ChromeDriver chrome = new ChromeDriver(); // launch chrome
			//chrome.get(url); // open url to test
			      // or
			driver = new ChromeDriver();
			//driver.get(url);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//EdgeDriver edge = new EdgeDriver(); // launch edge
			//edge.get(url); // open url to test
			       // or
			driver = new EdgeDriver();
			//driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//FirefoxDriver fire = new FirefoxDriver(); // launch firefox
			//fire.get(url); // open url to test
			
			driver = new FirefoxDriver();
			//driver.get(url);
		}
		
		driver.get(url); // open new url on which we have not visited
		
		PageFactory.initElements(driver, this); // to read external xpath
		
		// implicit wait - common time out for all elements if not found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		// window maximise
		     /*
	WebDriver.Options o =	driver.manage();
	WebDriver.Window w =  o.window();
	w.maximize(); 
	      */
		      // or
		driver.manage().window().maximize(); // short cut
		
	}
	
	public void closeBrowser()
	{
		driver.quit(); // closes all open tabs and ends session
		   // or
		//driver.close(); // close only current tab does not end complete session
	}

}
