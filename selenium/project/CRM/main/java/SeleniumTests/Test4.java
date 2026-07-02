package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Test4 {
		public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();

		    Actions builder = new Actions(driver);
		    // Open the browser
		    driver.get("https://crm.alchemy.hguy.co");

		    // Perform testing and assertions
		    System.out.println("Title of first page: "+driver.getTitle());
		    builder.pause(10000).build().perform();
		    WebElement user=driver.findElement(By.xpath("//input"));
		    WebElement password=driver.findElement(By.xpath("(//input)[2]"));
		    WebElement logIn=driver.findElement(By.xpath("//button"));
		    user.sendKeys("admin");
		    password.sendKeys("5Nx#I6BK%r3$8vz0ch");
		    logIn.click();
		    builder.pause(10000).build().perform();
		    if (driver.getCurrentUrl().contains("home")) {
		    	System.out.println("Home page verified");
		    	driver.quit();
		    	
		    }
		    
		    // Feel free to comment out the line below
		    // so it doesn't close too quickly

		  }
	}


