package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition1 extends BaseClass{
	@Then("get the title")
	public void check_the_title() {
		Assert.assertEquals(driver.getTitle(), "SuiteCRM Demo");
	}
}
