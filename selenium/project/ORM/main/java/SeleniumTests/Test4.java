package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Test4 {
		public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Actions builder = new Actions(driver);
		    // Open the browser
		    driver.get("https://hrm.alchemy.hguy.co/");

		    // Perform testing and assertions
		    System.out.println("Title of first page: "+driver.getTitle());
		    WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		    WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		    WebElement logIn=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		    user.sendKeys("orange");
		    password.sendKeys("5Nx#I6BK%r3$8vz0ch");
		    logIn.click();
		    builder.pause(2000).build().perform();
		    wait.until(ExpectedConditions.urlContains("dashboard"));
		    WebElement navItem = wait.until(
		    	    ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewPimModule"))
		    	);
		    navItem.click();
		    wait.until(ExpectedConditions.urlContains("pim"));
		    WebElement addButton=driver.findElement(By.id("btnAdd"));
		    addButton.click();
			 // Wait for Add Employee page
			 wait.until(ExpectedConditions.urlContains("addEmployee"));

			 builder.pause(2000).build().perform();
			 // Fill required fields
			 WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
			 firstName.sendKeys("Donaldo");
			 String expectedId = "1239";
			 WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
			 lastName.sendKeys("Trumps");
			 builder.pause(2000).build().perform();
			 WebElement ID= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("employeeId")));
			 ID.clear();
			 ID.sendKeys(expectedId);

			 builder.pause(2000).build().perform();
			 // Save
			 WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
			 saveButton.click();
			 
			 // Wait for employee details page
			 wait.until(ExpectedConditions.urlContains("viewPersonalDetails"));

			 builder.pause(2000).build().perform();
			 // Navigate back to Employee List
			 WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
			 employeeList.click();

			 builder.pause(2000).build().perform();
			 wait.until(ExpectedConditions.urlContains("viewEmployeeList"));
	
			// Search for employee
			 WebElement employeeName = wait.until(
			     ExpectedConditions.visibilityOfElementLocated(By.id("empsearch_employee_name_empName"))
			 );
			 employeeName.sendKeys("Donaldo Trumps");

			 builder.pause(2000).build().perform();
			 // Click Search
			 WebElement searchButton = wait.until(
			     ExpectedConditions.elementToBeClickable(By.id("searchBtn"))
			 );
			 searchButton.click();
			 builder.pause(2000).build().perform();
			 // Read Employee ID from first row, first cell
			 WebElement employeeId = wait.until(
			     ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a"))
			 );

			 String actualId = employeeId.getText();
			 
			 System.out.println(actualId);
			 builder.pause(2000).build().perform();
			 if(actualId.equals(expectedId))
			 {
			     System.out.println("Employee created successfully.");
			 }
			 else
			 {
			     System.out.println("Employee not found.");
			 }
			 driver.quit();
	
			  }
	}



