package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng4 {
    WebDriver driver;
    Actions builder;
    WebDriverWait wait;
    // Setup function
    @BeforeClass
    public void setUp() {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
	    builder = new Actions(driver);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the page
        driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");
    }
    
    // Test function
    @Test(priority = 1)
    public void loginTest() {
        // Assert page title
    	WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_name")));
	    WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_password")));
	    WebElement logIn=wait.until(ExpectedConditions.elementToBeClickable(By.id("bigbutton")));
	    user.sendKeys("will");
	    password.sendKeys("will");
	    logIn.click();
    }
    @Test(priority = 2)
    public void homeTest() {
        // Assert page title
    	
    if (driver.getCurrentUrl().contains("home")) {
    	System.out.println("Home page verified");
    }
    	
    }
    
    // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

