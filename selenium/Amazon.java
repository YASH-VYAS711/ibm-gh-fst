package Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(5000); 
	    // Perform testing and assertions
	    WebElement textBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	    textBox.sendKeys("Iphone 17 pro max");
	    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	    searchButton.click();
	    Thread.sleep(5000); 
//	    WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"));
	    WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]"));
	    System.out.println(price.getText());
//	    WebElement EnableButton = driver.findElement(By.xpath("//button[contains(text(),'Enable Input')]"));
	        
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
//	    driver.quit();
	  }
	}
