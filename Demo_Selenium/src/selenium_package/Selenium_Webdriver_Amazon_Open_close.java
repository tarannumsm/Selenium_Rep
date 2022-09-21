package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver_Amazon_Open_close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  //set the path of driver.this line is telling which browser and where is the driver
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  //create the object of the chrome driver browser
		WebDriver a = new ChromeDriver();
		//using get method to open the browser
		a.get("https://www.amazon.com/");
		//using close method to close the browser
		a.close();
		
		
		
		
		
		
		
		
	}

}
