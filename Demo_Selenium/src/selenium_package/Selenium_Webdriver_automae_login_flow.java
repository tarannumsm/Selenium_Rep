package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver_automae_login_flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement a = 	x.findElement(By.id("Email"));
		a.clear();
	    a.sendKeys("admin@yourstore.com");
	    WebElement b =   x.findElement(By.id("Password"));
		b.clear();
		b.sendKeys("admin");
		
	  x.findElement(By.className("button-1")).click();
		
		
		
		
		
		
	}

}
