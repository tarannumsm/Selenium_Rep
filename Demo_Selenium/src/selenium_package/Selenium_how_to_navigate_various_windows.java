package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_how_to_navigate_various_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
  WebDriver x = new ChromeDriver();
	x.get("https://www.google.com/");
	Thread.sleep(3000);
  x.navigate().to("https://www.amazon.com/");
  x.navigate().back();
  Thread.sleep(3000);
  x.navigate().forward();
  x.close();
	}

}
