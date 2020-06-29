package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetCommands {

	WebDriver driver;
	String url;

	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	public void getCommands() {

		driver.get("http://newtours.demoaut.com");
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page is:" + titleOfPage);
		driver.findElement(By.linkText("REGISTER")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println("The current url is :" + currenturl);
		// String pageSource = driver.getPageSource();
		System.out.println("The page source of the page is:" + driver.getPageSource());

	}

	public static void main(String[] args) {
		TogetCommands myObj = new TogetCommands();
		myObj.invokebrowser();
		myObj.getCommands();

	}
}
