package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition7 extends BaseClass{
	@Given("user navigates to leads page")
    public void user_navigates_to_leads_page() {

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Leads\"]")).click();
    }

    @When("user clicks on lead info icon")
    public void user_clicks_on_lead_info_icon() {

        WebElement info = driver.findElement(
                By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")
        );

        info.click();

    }

    @Then("phone number should be displayed")
    public void phone_number_should_be_displayed() {

    	WebElement phone = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("/html/body/div[2]/div[1]/div[6]/div[2]/span")
                )
        );


        String phoneText = phone.getText();

        System.out.println("Phone no: " + phoneText);

        Assert.assertNotNull(phoneText, "Phone number is null");
        Assert.assertFalse(phoneText.isEmpty(), "Phone number is empty");
    }
}
