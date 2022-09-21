package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		WebDriver browserDriver = new ChromeDriver();
		browserDriver.get("https://admin-demo.nopcommerce.com/login");
		WebElement a = browserDriver.findElement(By.id("Email"));
		a.clear();
	    a.sendKeys("admin@yourstore.com");
	    WebElement b = browserDriver.findElement(By.id("Password"));
	  b.clear();
	   b.sendKeys("admin");
	 
		
	}

}
