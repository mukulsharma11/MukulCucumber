package core;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Hook extends Page
{
	
	public void openBrowser(String browser,String url)  // define
	{
		super.openBrowser(browser, url);
	}
	
	// login test ..
    @FindBy(xpath = externalxpath.AmazonXpath.signin )
    public static WebElement signin;
    
    @FindBy(xpath = externalxpath.AmazonXpath.userid )
    public static WebElement userid;
    
    @FindBy(xpath = externalxpath.AmazonXpath.ctnbtn )
    public static WebElement ctnbtn;
    
    @FindBy(xpath = externalxpath.AmazonXpath.err1 )
    public static WebElement err1;
    
    @FindBy(xpath = externalxpath.AmazonXpath.password )
    public static WebElement password;
    
    @FindBy(xpath = externalxpath.AmazonXpath.submit )
    public static WebElement submit;
    
    @FindBy(xpath = externalxpath.AmazonXpath.err2 )
    public static WebElement err2;
    
    // search..
    
    @FindBy(xpath = externalxpath.AmazonXpath.searchtxtbox )
    public static WebElement searchtxtbox;
    
    @FindBy(xpath = externalxpath.AmazonXpath.productlink )
    public static List<WebElement> productlink;   // List of multiple webelements
    
    
}
