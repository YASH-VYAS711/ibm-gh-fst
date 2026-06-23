package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/target-practice");

	    // Perform testing and assertions
	    System.out.println("Title of the page: "+driver.getTitle());
	    WebElement header3 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]"));
	    System.out.println("3rd Header: "+header3.getText());
	    WebElement header5 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5"));
	    System.out.println("5th Header: "+header5.getCssValue("color"));
	    WebElement purpleButton = driver.findElement(By.xpath("//button[contains(@class, 'purple')]"));
	    System.out.println("Purple button classes: "+purpleButton.getAttribute("class"));
	    WebElement staleButton = driver.findElement(By.xpath("//button[contains(@class, 'slate')]"));
	    System.out.println("Stale Button: "+staleButton.getText());
	    // Close the browser
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	  }
	}
