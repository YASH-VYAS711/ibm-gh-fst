package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/selects");
	    System.out.println(driver.getTitle());
	    WebElement fullname=driver.findElement(By.xpath("//input"));
	    WebElement email=driver.findElement(By.xpath("//input[2]"));
	    WebElement  date=driver.findElement(By.xpath("//input[@type='date']"));
	    WebElement details=driver.findElement(By.xpath("//textarea"));
	    WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	    fullname.sendKeys("Yash Vyas");
	    System.out.println(fullname.getText());
	    // Perform testing and assertions
 	    driver.quit();
	  }
	}

