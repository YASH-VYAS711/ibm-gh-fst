package Testng;

import java.time.Duration;
import java.util.List;

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

public class Testng8 {
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
    public void navigationToAccountsTest() {
        // Assert page title
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolbar")));
    	WebElement Sales = driver.findElement(By.id("grouptab_0"));
	    Sales.click();
	    WebElement Accounts = driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Accounts\"]"));
	    Accounts.click();
	    wait.until(ExpectedConditions.urlContains("Accounts"));
    }
    
    @Test(priority = 3)
    public void oddNumberRowsTest() {
    	List<WebElement> rows = driver.findElements(
	    	    By.xpath("//tr[starts-with(@class,'oddListRow')]")
	    	);
	    System.out.println("\n\n");
	    System.out.println("The first 5 odd numbered rows are: ");
	    System.out.println("");
	    for(int i =0; i<5; i++) {
	    	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	    	System.out.println(cols.get(2).getText());
	    }
    }
    
    
    // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


