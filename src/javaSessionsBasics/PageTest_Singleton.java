package javaSessionsBasics;

import org.openqa.selenium.WebDriver;

public class PageTest_Singleton {
	static WebDriver driver;

	public static void main(String[] args) {
		DriverInit driver_Init = DriverInit.getInstance();
		driver = driver_Init.openBrowser();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

}
