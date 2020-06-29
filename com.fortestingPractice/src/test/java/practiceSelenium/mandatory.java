package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mandatory {
	// creating a webdriver here makes it global, outside any function so when you
	// type "driver" you can use it anywhere
	WebDriver driver;

	public void invokeBrowser() {
		// the below code helps us to manage browser properties

		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// the below code is to face the URL

		driver.get("https://www.objectivewellness.com");

	}

	public void test1() {
		try {

			driver.findElement(By.id("ltkpopup-close-button")).click();
			// Thread.sleep(2000);
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".jss326 > button:nth-child(1) > span:nth-child(1)")).click();
			driver.findElement(By.xpath("//span[@class='MuiButton-label']/p")).click();
			driver.findElement(By.cssSelector("a.MuiButtonBase-root >span:nth-child(1)")).click();

			// to perform Scroll on application using Selenium
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// creating the object of a class, using the class name "mandatory"
		mandatory myObject = new mandatory(); // myObject is the the object/ instance

		// instantiating this class using "myObject". and calling the function/ method
		// which is called invokeBrowser()
		myObject.invokeBrowser();
		// call test1() function method
		myObject.test1();

		// this comment is added for pushing
	}

}
