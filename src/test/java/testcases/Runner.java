package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\feature\\document.feature",
		//tags = "@login or @search",
		//tags = "@login",
		tags = "@search",
		glue = {"testcases"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"},
		publish = true
		)

public class Runner 
{

}
