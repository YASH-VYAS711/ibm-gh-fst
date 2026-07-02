package SeleniumTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://hrm.alchemy.hguy.co/");

	    // Perform testing and assertions
	    System.out.println("Title of first page: "+driver.getTitle());
	    if (driver.getTitle().equals("OrangeHRM")) {
	    	System.out.println("Verified");
		    driver.quit();
	    }
	    else {
	    	System.out.println("Wrong Title");
	    }
	    // Close the browser
	    
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly

	  }
}
