package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition6 extends BaseClass{
	@Then("sales navigation item should be displayed")
    public void sales_navigation_item_should_be_displayed() {

        WebElement navItem = driver.findElement(By.id("grouptab_0"));

        String actualText = navItem.getText().trim();

        Assert.assertEquals(
                actualText.toLowerCase(),
                "sales",
                "Sales navigation item is not present."
        );
    }
}
