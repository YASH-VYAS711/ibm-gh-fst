package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import java.time.Duration;

public class Fixtures extends BaseClass {
    @Before(order = 1)
    public void setUp() {
        // Initialize Firefox Driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @Before(order = 2)
    public void openLoginPage() {
        driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");
    }
    
    @Before(order = 3, value = "@Login")
    public void login() {
        driver.findElement(By.id("user_name")).sendKeys("will");
        driver.findElement(By.id("username_password")).sendKeys("will");
        driver.findElement(By.id("bigbutton")).click();
    }
    
    @After
    public static void tearDown() {
        // Close the browser
    	if (driver != null) {
            driver.quit();
        }
    }
}