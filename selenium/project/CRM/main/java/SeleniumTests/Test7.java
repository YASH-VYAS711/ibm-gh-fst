package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Test7 {
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
		    WebElement Sales = driver.findElement(By.id("grouptab_0"));
		    Sales.click();
		    WebElement Leads = driver.findElement(By.xpath("//*[@id=\"moduleTab_6_Leads\"]"));
		    Leads.click();
		    wait.until(ExpectedConditions.urlContains("Leads"));
		    WebElement info = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")); 
		    info.click();
		    builder.pause(1000).build().perform();
		    WebElement phone = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[6]/div[2]/span")); 
		    System.out.println("Phone no: "+phone.getText()	);
		  }
	}




