package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-controls");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
	    System.out.println("is checkbox visible? : "+checkbox.isDisplayed());
	    System.out.println("Now we are clicking Remove Checkbox button");
	    WebElement toggleButton = driver.findElement(By.xpath("//button[contains(text(),'Checkbox')]"));
	    toggleButton.click();
	    System.out.println("is checkbox visible? : "+checkbox.isDisplayed());   // Close the browser
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
