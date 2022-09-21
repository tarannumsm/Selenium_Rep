package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  WebDriver x = new ChromeDriver();
			x.get("https://www.cnbc.com/");
		x.navigate().to("https://www.google.com/");
		x.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		x.navigate().back();
		x.navigate().forward();
		
		
		
	}

}
