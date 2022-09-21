package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Set_Priroties {
	WebDriver browserObject;
	// 1. The @Test is used along with priority and based on priority the method will exceute. The piority is set as 1 .So this will exceute first.
	@Test(priority =2)
    	public void openingAmazonSite() throws InterruptedException {
      // 2. setup the property of Webdriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	// 4. Open the web page http://www.amazon.com/ in first test case
        browserObject.get("http://www.amazon.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	// 6. close the browser
        browserObject.close();
    }
   // 1. The @Test is used along with priority and based on priority the method will exceute. The piority is set as 2 .So this will exceute second.
    @Test(priority =3)
    public void openingCNNBCSite() throws InterruptedException {
	 // 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	 // 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
	 // 4. Open the web page http://www.cnn.com/ in second test case
        browserObject.get("https://www.cnbc.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
        browserObject.close();
    }
    // 1. The @Test is used along with priority and based on priority the method will exceute. The piority is set as 3.So this will exceute third.
    @Test(priority =1)
    public void openingYahooSite() throws InterruptedException {
	// 2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
	 // 4. Open the web page http://www.yahoo.com/ in second test case
        browserObject.get("http://www.yahoo.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	// 6. close the browser
        browserObject.close();
    }
}
