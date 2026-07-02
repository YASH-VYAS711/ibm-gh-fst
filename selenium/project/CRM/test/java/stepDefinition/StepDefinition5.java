package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition5 extends BaseClass{
	@Then("navigation bar color should be displayed")
    public void nav_color_check() {

        WebElement nav = driver.findElement(By.xpath("//nav"));

        String color = nav.getCssValue("color");

        Assert.assertEquals(color, "rgb(83, 77, 100)");
    }
}
