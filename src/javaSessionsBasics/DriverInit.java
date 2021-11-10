package javaSessionsBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit singleton_Selenium = null;
	private WebDriver driver;

	private DriverInit() {
		System.out.println("Private Constructor");
	}

	public static DriverInit getInstance() {
		if (singleton_Selenium == null) {
			singleton_Selenium = new DriverInit();
		}
		return singleton_Selenium;
	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GK_Work\\gk\\codebase_gk\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
}