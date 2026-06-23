package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-controls");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement textBox = driver.findElement(By.id("textInput"));
	    System.out.println("is Textbox visible? : "+textBox.isEnabled());
	    System.out.println("Now we are clicking Enable Textbox button");
	    WebElement EnableButton = driver.findElement(By.xpath("//button[contains(text(),'Enable Input')]"));
	    EnableButton.click();
	    System.out.println("is textbox visible? : "+textBox.isDisplayed());   // Close the browser
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
