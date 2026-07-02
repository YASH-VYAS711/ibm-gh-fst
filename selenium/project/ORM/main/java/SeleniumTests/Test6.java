package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.Select;
	public class Test6 {
		
		public static void main(String[] args) {
	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        Actions builder = new Actions(driver);

	        // Open the browser
	        driver.get("https://hrm.alchemy.hguy.co/");

	        // Perform testing and assertions
	        System.out.println("Title of first page: " + driver.getTitle());

	        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
	        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
	        WebElement logIn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));

	        user.sendKeys("orange");
	        password.sendKeys("5Nx#I6BK%r3$8vz0ch");
	        logIn.click();

	        wait.until(ExpectedConditions.urlContains("dashboard"));

	     // Locate Directory menu
	        WebElement directory = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("menu_directory_viewDirectory"))
	        );
	        builder.pause(1000).build().perform();
	        // Verify it is displayed and clickable
	        if (directory.isDisplayed() && directory.isEnabled()) {
	            System.out.println("Directory menu is visible and clickable.");

	            builder.pause(1000).build().perform();

	            directory.click();
	        } else {
	            System.out.println("Directory menu is not clickable.");
	        }

	        // Wait for Directory page
	        wait.until(ExpectedConditions.urlContains("directory"));

	        // Verify page heading
	        WebElement heading = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1"))
	        );

	        if (heading.getText().equals("Search Directory")) {
	            System.out.println("Heading verified.");
	        } else {
	            System.out.println("Heading verification failed.");
	        }

	        driver.quit();
	    }
	}