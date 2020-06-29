package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TonaviagateCommands {

	WebDriver driver;

	public void invockBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			navigatCommands();
			closeBrowser();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void navigatCommands() {

		try {
			driver.navigate().to("http://newtours.demoaut.com");
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.linkText("SUPPORT"));
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			// since we are using Thread we need to surround this code with interrupted
			// exception
			e.printStackTrace();
		}
	}

	public void cssElementLocator() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("bbbb");

	}

	public void closeBrowser() {

		try {
			// driver.close();
			// driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TonaviagateCommands myObj = new TonaviagateCommands();
		myObj.invockBrowser();
		myObj.cssElementLocator();

	}
}
