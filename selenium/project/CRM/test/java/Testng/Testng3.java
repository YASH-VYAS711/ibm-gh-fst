package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng3 {
    WebDriver driver;
    Actions builder;
    // Setup function
    @BeforeClass
    public void setUp() {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
	    builder = new Actions(driver);
        // Open the page
        driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");
    }
    
    // Test function
    @Test(priority = 1)
    public void copyrightTest() {
        // Assert page title
    	WebElement copyWrite=driver.findElement(By.id("admin_options"));
	    System.out.println(copyWrite.getText());
    }
    

    
    // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

