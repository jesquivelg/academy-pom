package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {
	
	static WebDriver driver;
	
	public static WebDriver createDriverSession() {
	
		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		return new ChromeDriver();
		
	}
	
	public static WebDriver getWebDriverSession() {
		
		if (driver == null) {
			driver = createDriverSession();
			return driver;
		} else {
			return driver;
		}
	}
}
