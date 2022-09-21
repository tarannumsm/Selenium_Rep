package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_webDriver_first_google_Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. set the path of driver
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		//create the object of chrome driver browser
		WebDriver a = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method
		a.get("http://www.google.com/");
		
		
	}

}
