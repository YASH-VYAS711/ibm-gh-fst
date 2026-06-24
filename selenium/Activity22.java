package Activity;

import java.lang.module.ModuleDescriptor.Builder;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder=new Actions(driver);

        driver.get("https://training-support.net/webelements/popups");
        System.out.println("Page title: " + driver.getTitle());

       driver.findElement(By.id("launcher")).click();
       builder.pause(1000);
       driver.findElement(By.id("username")).sendKeys("admin");

       driver.findElement(By.id("password")).sendKeys("password");
       driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        

        driver.quit();
    }
}