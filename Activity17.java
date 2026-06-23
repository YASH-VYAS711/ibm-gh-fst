package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity17 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/selects");
	    System.out.println(driver.getTitle());
	    WebElement selecte=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
	    Select select = new Select(selecte);
	    select.selectByVisibleText("HTML");
	    builder.pause(1000).build().perform();

	    select.selectByIndex(4);
	    select.selectByIndex(5);
	    select.selectByIndex(6);
	    builder.pause(1000).build().perform();
	    
	    select.selectByValue("nodejs");
	    builder.pause(1000).build().perform();
	    select.deselectByIndex(5);
	    builder.pause(1000).build().perform();
	    // Perform testing and assertions
 	    driver.quit();
	  }
	}

