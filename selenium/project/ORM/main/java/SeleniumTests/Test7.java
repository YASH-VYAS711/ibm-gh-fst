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

        builder.pause(1000).build().perform();
        // Click My Info
        WebElement myInfo = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))
        );
        myInfo.click();

        wait.until(ExpectedConditions.urlContains("viewMyDetails"));

        // Click Qualifications from left menu
        WebElement qualification = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidenav\"]/li[9]/a"))
        );
        qualification.click();

        wait.until(ExpectedConditions.urlContains("viewQualifications"));

        // Click Add Work Experience
        WebElement addButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("addWorkExperience"))
        );
        addButton.click();

        // Company
        WebElement company = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("experience_employer"))
        );
        company.sendKeys("Test Company");

        // Job Title
        WebElement jobTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("experience_jobtitle"))
        );
        jobTitle.sendKeys("Test Title");

        // Comments
        WebElement comments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("experience_comments"))
        );
        comments.sendKeys("Testing");

        // Save
        WebElement saveButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("btnWorkExpSave"))
        );
        saveButton.click();

        // Wait for success message
        WebElement successMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div.message.success.fadable")
                )
        );

        System.out.println(successMessage.getText());

        driver.quit();
    }
}