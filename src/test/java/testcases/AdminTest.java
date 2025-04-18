package testcases;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AdminTest extends Hook
{
	public static boolean f = true;
	
	@Given("I want to open {string} with url {string}")
	public void i_want_to_open_with_url(String browser, String url) 
	{
	    openBrowser(browser,url);
	}
	@Given("click sign in")
	public void click_sign_in() 
	{
	    signin.click();
	}
	@When("I enter valid usereid {string}")
	public void i_enter_valid_usereid(String mob) 
	{
	    userid.sendKeys(mob);
	}
	@When("click continue buton")
	public void click_continue_buton() 
	{
	    ctnbtn.click();
	}
	@Then("I should get password textbox")
	public void i_should_get_password_textbox() 
	{
	   if( password.isDisplayed())
	   {
		   f = true;
	   }
	   else
	   {
		   Assert.fail();
		   f = false;
	   }
	}
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(f == true)
	    {
	    	f = true;
	    }
	    else
	    {
	    	f = false;
	    }
	}
	@When("i enter password {string}")
	public void i_enter_password(String pwd) 
	{
	    if(f == true)
	    {
	    	password.sendKeys(pwd);
	    	submit.click();
	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{
	   
	}
}
