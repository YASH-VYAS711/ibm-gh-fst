package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Test6 {
		public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Actions builder = new Actions(driver);
		    // Open the browser
		    driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");

		    // Perform testing and assertions
		    System.out.println("Title of first page: "+driver.getTitle());
		    WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_name")));
		    WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_password")));
		    WebElement logIn=wait.until(ExpectedConditions.elementToBeClickable(By.id("bigbutton")));
		    user.sendKeys("will");
		    password.sendKeys("will");
		    logIn.click();
		    wait.until(ExpectedConditions.urlContains("Home"));
		    WebElement navItem = driver.findElement(By.id("grouptab_0"));
		    System.out.println("Does sales exists in Navigation: " + navItem.getText().toLowerCase().equals("sales"));
		    driver.quit();

		  }
	}



