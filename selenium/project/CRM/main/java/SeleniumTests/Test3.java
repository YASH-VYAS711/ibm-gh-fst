package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Test3 {
		public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();

		    Actions builder = new Actions(driver);
		    // Open the browser
		    driver.get("https://crm.alchemy.hguy.co");

		    // Perform testing and assertions
		    System.out.println("Title of first page: "+driver.getTitle());
		    builder.pause(5000).build().perform();
		    WebElement copyWrite=driver.findElement(By.xpath("//a"));
		    System.out.println(copyWrite.getText());
		    driver.quit();
		    // Close the browser
		    
		    // Feel free to comment out the line below
		    // so it doesn't close too quickly

		  }
	}


