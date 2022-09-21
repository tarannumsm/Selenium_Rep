package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_How_to_use_redio_button_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("http://training.qaonlinetraining.com/testPage.php");
		
		
		
		WebElement checkboxBike = x.findElement(By.xpath("//input[@value = 'Bike']"));
		WebElement checkboxCar = x.findElement(By.xpath("//input[@value = 'car']"));
		WebElement checkboxBoat = x.findElement(By.xpath("//input[@value = 'boat']"));
		WebElement checkboxHorse = x.findElement(By.xpath("//input[@value = 'horse']"));
		WebElement SubmitButton = x.findElement(By.xpath("//input[@value = 'Send']"));
		Thread.sleep(6000);
		checkboxBike.click();
		Thread.sleep(6000);
		checkboxCar.click();
		Thread.sleep(6000);
		checkboxBoat.click();
		Thread.sleep(6000);
		checkboxHorse.click();
		Thread.sleep(6000);
		
		x.close();
		
		
		
		
		
	}

}
