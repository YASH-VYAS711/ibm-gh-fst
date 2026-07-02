package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition4 extends BaseClass{
	@Then("user should be on home page")
	public void verify_home() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("Home"));
	}
}
