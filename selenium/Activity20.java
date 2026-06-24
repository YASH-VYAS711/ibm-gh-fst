package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1));
	    // Open the browser
	    driver.get("https://training-support.net/webelements/alerts");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//Button[contains(text(),'Prompt')]")).click();
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();

	    alert.sendKeys("Awesome!");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    alert.accept();
	    
 	    driver.quit();
	  }
	}

