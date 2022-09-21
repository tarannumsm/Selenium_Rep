package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_How_to_use_Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select Countryselect = new Select(x.findElement(By.name("Country")));

		Countryselect .selectByVisibleText("France");
		
		Select skillselect = new Select(x.findElement(By.name("skill")));
		Countryselect .selectByVisibleText("Database");
	}

}
