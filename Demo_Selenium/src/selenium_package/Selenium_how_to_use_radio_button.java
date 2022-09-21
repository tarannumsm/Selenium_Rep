package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_how_to_use_radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("http://training.qaonlinetraining.com/testPage.php");
		
		WebElement radioButtonFemale = x.findElement(By.xpath("//input[@value = 'female']"));
		WebElement radioButtonMale = x.findElement(By.xpath("/html/body/form/input[5]"));
		WebElement radioButtonOther = x.findElement(By.xpath("//input[@value = 'Other']"));
		WebElement submitButton = x.findElement(By.xpath("//input[@value = 'Send']"));
		radioButtonFemale.click();
		Thread.sleep(6000);
		radioButtonMale.click();
		Thread.sleep(6000);
		radioButtonOther.click();
		Thread.sleep(6000);
		 submitButton.click();	
	}

}
