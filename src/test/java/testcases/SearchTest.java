package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest extends Hook
{
	
	@Given("browser {string} is open with url {string}")
	public void browser_is_open_with_url(String browser, String url)
	{
	   openBrowser(browser,url);
	}
	@When("^i search for (.*) in price (.*)")
	public void i_search_for_in_price(String product,int price) 
	{
		searchtxtbox.clear();
		searchtxtbox.sendKeys(product +" in price "+price);
	}
	
	@Then("results must come")
	public void results_must_come()
	{
	    Actions a = new Actions(driver);
	    a.sendKeys(Keys.ENTER).perform();
	}


}
