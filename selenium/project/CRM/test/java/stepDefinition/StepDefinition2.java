package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition2 extends BaseClass{
	@Then("login page logo should be visible")
    public void login_page_logo_should_be_visible() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form']/div[1]/img")));
        System.out.println(logo.getAttribute("src"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not visible");
    }
	@Then("login page logo source should be correct")
	public void login_page_logo_source_should_be_correct() { 
		WebElement logo = driver.findElement(By.xpath("//*[@id='form']/div[1]/img")); 
		Assert.assertEquals(logo.getAttribute("src"),"https://demo.suiteondemand.com/themes/default/images/company_logo.png?v=LU7YMpbvQ1dGhPBmRN4HQw"); 
		}
}
