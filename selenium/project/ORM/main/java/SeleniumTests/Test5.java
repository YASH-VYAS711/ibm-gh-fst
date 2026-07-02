package SeleniumTests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.time.Duration;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.Select;public class Test5 {
		
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

	        // Click My Info
	        builder.pause(2000).build().perform();
	        WebElement myInfo = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))
	        );
	        myInfo.click();

	        // Wait for My Info page
	        wait.until(ExpectedConditions.urlContains("viewMyDetails"));

	        // Click Edit
	        WebElement editButton = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("btnSave"))
	        );
	        editButton.click();

	        // Edit Name
	        WebElement firstName = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("personal_txtEmpFirstName"))
	        );
	        firstName.clear();
	        firstName.sendKeys("Jon");

	        WebElement lastName = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("personal_txtEmpLastName"))
	        );
	        lastName.clear();
	        lastName.sendKeys("Doe2");

	        // Select Gender
	        WebElement gender = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("personal_optGender_1"))
	        );
	        gender.click();

	        // Select Nationality
	        WebElement nationality = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("personal_cmbNation"))
	        );
	        Select nation = new Select(nationality);
	        nation.selectByVisibleText("Indian");

	        // Date of Birth
	        WebElement dob = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("personal_DOB"))
	        );
	        dob.clear();
	        dob.sendKeys("2002-11-07");

	        // Save

	        editButton.click();
	        WebElement successMessage = wait.until(
	        	    ExpectedConditions.visibilityOfElementLocated(
	        	            By.cssSelector("div.message.success.fadable")
	        	    	    )
	        	);

	        	if(successMessage.getText().contains("Successfully Saved"))
	        	{
	        	    System.out.println("User information updated successfully.");
	        	}

	        driver.quit();
	    }
	}



