package Activity;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-controls");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
	    WebElement toggleButton = driver.findElement(By.xpath("//button[contains(text(),'Checkbox')]"));
	    toggleButton.click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));
	    System.out.println("is checkbox visible? : "+checkbox.isDisplayed());   // Close the browser
	    toggleButton.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));
	    System.out.println("is checkbox visible? : "+checkbox.isDisplayed());   // Close the browser
	    checkbox.click();
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
