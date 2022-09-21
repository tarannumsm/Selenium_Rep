package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver_My_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("https://www.itlearn360.com/");	
		
		Thread.sleep(2000);
		x.manage().window().fullscreen();
		Thread.sleep(2000);
		x.findElement(By.id("loginlabel")).click();
		Thread.sleep(2000);
		x.findElement(By.name("log")).sendKeys("tarannumsm3@gmail.com");
		Thread.sleep(2000);
		x.findElement(By.name("pwd")).sendKeys("Z@feer09");
		Thread.sleep(2000);
		x.findElement(By.name("wp-submit")).click();
		Thread.sleep(2000);
		x.manage().window().fullscreen();
		x.findElement(By.className("lg_button")).click();
		Thread.sleep(2000);
		x.findElement(By.id("menu-item-13318")).click();
		Thread.sleep(2000);
		x.navigate().to("https://www.facebook.com/itlearn360");
		Thread.sleep(2000);
		x.navigate().back();
		x.navigate().to("https://twitter.com/ITlearn360");
		Thread.sleep(2000);
		x.navigate().back();
		x.navigate().to("https://www.instagram.com/itlearn360/");
		Thread.sleep(2000);
		x.navigate().back();
		x.navigate().to("https://www.youtube.com/c/ITlearn360");
		Thread.sleep(2000);
		x.navigate().back();
		Thread.sleep(2000);
		x.findElement(By.id("menu-item-13318")).click();
		Thread.sleep(2000);
		x.findElement(By.id("menu-item-10835")).click();
		Thread.sleep(2000);
		x.findElement(By.name("search_course")).sendKeys("Selenium");
		Thread.sleep(2000);
		x.findElement(By.name("search_course")).clear();
		Thread.sleep(2000);
		x.findElement(By.className("bestplanButton")).click();
		Thread.sleep(2000);
		
	}

}
