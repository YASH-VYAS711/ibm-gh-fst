package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition8 extends BaseClass{
	 @When("user navigates to Accounts page")
	    public void user_navigates_to_accounts_page() {

	        driver.findElement(By.id("grouptab_0")).click();
	        driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Accounts\"]")).click();
	    }

	    @Then("first five odd rows should be displayed")
	    public void first_five_odd_rows_should_be_displayed() {

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//tr[starts-with(@class,'oddListRow')]")
	        );

	        System.out.println("First 5 odd rows:");

	        for (int i = 0; i < 5; i++) {
	            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	            System.out.println(cols.get(2).getText());
	        }
	    }
}
