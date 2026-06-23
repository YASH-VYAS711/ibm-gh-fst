package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
		    
		    // Open the browser
		    driver.get("https://training-support.net/webelements/login-form/");

		    // Perform testing and assertions
		    System.out.println("Title of first page: "+driver.getTitle());
		    WebElement input = driver.findElement(By.tagName("input"));
		    WebElement password = driver.findElement(By.name("password"));
		    input.sendKeys("admin");
		    password.sendKeys("password");
		    WebElement element = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button"));
		    element.click();
		    String s = driver.findElement(By.tagName("h1")).getText();
		    System.out.println(s);
		    // Close the browser
		    
		    // Feel free to comment out the line below
		    // so it doesn't close too quickly
		    driver.quit();
		  }
		}

