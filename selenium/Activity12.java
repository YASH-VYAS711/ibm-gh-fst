package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/drag-drop");
	    WebElement ball=driver.findElement(By.id("ball"));
	    WebElement zone1=driver.findElement(By.id("dropzone1"));
	    WebElement zone2=driver.findElement(By.id("dropzone2"));
	    WebElement zone1text=driver.findElement(By.xpath("//*[@id=\"dropzone1\"]/span"));
	    WebElement zone2text=driver.findElement(By.xpath("//*[@id=\"dropzone2\"]/span"));
	    builder.clickAndHold(ball).build().perform();
	    builder.moveToElement(zone1).build().perform();
	    System.out.println(zone1text.getText());
	    if (zone1text.getText().equals("Dropped!")) {
	    	builder.moveToElement(zone2).build().perform();
	    	System.out.println(zone2text.getText());
	    }
	    // Perform testing and assertions
	    driver.quit();
	  }
	}

