package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity16 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/selects");
	    System.out.println(driver.getTitle());
	    WebElement selecte=driver.findElement(By.xpath("//select"));
//	    WebElement multiSelecte=driver.findElement(By.xpath("//select[2]"));
	    Select select = new Select(selecte);
	    List<WebElement> options = select.getOptions();
	    select.selectByVisibleText("Two");
	    builder.pause(1000).build().perform();

	    select.selectByIndex(3);
	    builder.pause(1000).build().perform();
	    
	    select.selectByValue("four");
	    builder.pause(1000).build().perform();
	    
	    for(WebElement i : options) {
	    	System.out.println(i.getText());
	    }
	    // Perform testing and assertions
 	    driver.quit();
	  }
	}

