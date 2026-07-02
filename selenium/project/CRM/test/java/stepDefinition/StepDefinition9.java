package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition9 extends BaseClass{
	@When("user navigates to Leads page")
    public void user_navigates_to_leads_page() {

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Leads\"]")).click();
    }

    @Then("first ten lead rows should be displayed")
    public void first_ten_lead_rows_should_be_displayed() {

        List<WebElement> rows = driver.findElements(
                By.xpath("//tr[contains(@class,'ListRowS1')]")
        );

        System.out.println("First 10 Leads:");

        for (int i = 0; i < 10; i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            System.out.println(
                    cols.get(2).getText() + "       " + cols.get(7).getText()
            );
        }
    }
}
