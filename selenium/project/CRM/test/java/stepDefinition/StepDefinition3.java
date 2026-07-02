package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition3 extends BaseClass{
	@Given("user is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");
    }

    @Then("copyright text should be displayed")
    public void copyright_text_should_be_displayed() {
        WebElement copyWrite = driver.findElement(By.id("admin_options"));
        String actualText = copyWrite.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.length() > 0, "Copyright text is missing");
    }
}
