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

public class Testng7 {
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
    public void navigationToLeadsTest() {
        // Assert page title
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolbar")));
    	WebElement Sales = driver.findElement(By.id("grouptab_0"));
	    Sales.click();
	    WebElement Leads = driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Leads\"]"));
	    Leads.click();
	    wait.until(ExpectedConditions.urlContains("Leads"));
    }
    
    @Test(priority = 3)
    public void phoneNumberTest() {
    WebElement info = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")); 
    info.click();
    builder.pause(1000).build().perform();
    WebElement phone = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[6]/div[2]/span")); 
    System.out.println("Phone no: "+phone.getText()	);
    }
    
    
    // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


