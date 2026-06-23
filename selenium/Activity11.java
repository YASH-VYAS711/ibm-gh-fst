package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/keyboard-events");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    builder.sendKeys("Hi How are you?").build().perform();
	    WebElement text = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1"));
	    System.out.println(text.getText());
	    driver.quit();
	  }
	}
