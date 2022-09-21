package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver_Populate_input_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();//name of the object is x
		x.get("http://training.qaonlinetraining.com/testPage.php");
		
		x.findElement(By.name("name")).sendKeys("tarannum");
		x.findElement(By.name("email")).sendKeys("tarannumsm3@gmail.com");
		x.findElement(By.name("website")).sendKeys("amazon");
		x.findElement(By.name("comment")).sendKeys("i am learning selenium");
		x.findElement(By.name("comment")).sendKeys("i am learning selenium");
		x.findElement(By.name("submit")).click();
		x.close();
		
		
		
		
	}

}
