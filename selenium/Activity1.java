package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/");

	    // Perform testing and assertions
	    System.out.println("Title of first page: "+driver.getTitle());
	    WebElement element = driver.findElement(By.xpath("/html/body/div/main/div/div/main/a"));
	    element.click();
	    System.out.println("Title of second page: "+driver.getTitle());
	    // Close the browser
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
