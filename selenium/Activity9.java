package Activity;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-content");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(),'Click me')]"));
	    clickButton.click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    WebElement word = driver.findElement(By.xpath("//h2[@id='word']"));
	    System.out.println("is checkbox visible? : "+word.getText());   // Close the browser
	    if (wait.until(ExpectedConditions.textToBe(By.id("word"), "release"))) {
	    	System.out.println(word.getText());
	    }
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
