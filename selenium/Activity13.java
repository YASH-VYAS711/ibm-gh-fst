package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13 {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    Actions builder = new Actions(driver);
	    // Open the browser
	    driver.get("https://training-support.net/webelements/tables");
	    List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
	    System.out.println("Number of columns "+cols.size());
	    List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
	    List<WebElement> row3=driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	    WebElement row2col2=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
	    System.out.println("Number of rows "+rows.size());
	    for (int i=0; i<row3.size();i++) {
	    	System.out.println("Row 3 "+"Column "+(i+1)+" is: "+row3.get(i).getText());
	    }
	    System.out.println("Second row second column is "+ row2col2.getText());
	    // Perform testing and assertions
 	    driver.quit();
	  }
	}

