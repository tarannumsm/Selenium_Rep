package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("https://identity.my.vccs.edu");
		x.findElement(By.id("identification")).clear();
		
	       x.findElement(By.id("identification")).sendKeys("mk10091");
		  x.findElement(By.id("authn-go-button")).click();
		
		
		
	}

}
