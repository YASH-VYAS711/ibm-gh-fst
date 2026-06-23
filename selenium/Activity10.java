package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/mouse-events");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement text = driver.findElement(By.id("result"));
	    WebElement clickButton = driver.findElement(By.xpath("//h1[contains(text(),'Cargo.lock')]"));
	    WebElement tomlButton = driver.findElement(By.xpath("//h1[contains(text(),'Cargo.toml')]"));
	    WebElement srcButton = driver.findElement(By.xpath("//h1[contains(text(),'src')]"));
	    WebElement targetButton = driver.findElement(By.xpath("//h1[contains(text(),'target')]"));
	    clickButton.click();
	    System.out.println("Text: "+text.getText());
	    builder.moveToElement(tomlButton).build().perform();
	    tomlButton.click();
	    System.out.println("Text: "+text.getText());
	    builder.moveToElement(srcButton).build().perform(); 
	    builder.doubleClick(srcButton).build().perform();// Close the browser
	    System.out.println("Text: "+text.getText());
	    builder.contextClick(targetButton).build().perform();

	    WebElement openButton = driver.findElement(By.xpath("//span[contains(text(),'Open')]"));
	    openButton.click();
	    builder.pause(500).build().perform();
	    System.out.println("Text: "+text.getText());
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
