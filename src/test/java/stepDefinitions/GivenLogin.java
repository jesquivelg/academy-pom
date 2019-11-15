package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Pages.GivenLoginPage;
import io.cucumber.java.en.Given;

import utils.WebDriverSession;

public class GivenLogin {
	

	//@Given("User opens the browser")
	//public static void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Browser is open!");
		
		//System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//}
	public static void waitUntilPageLoad() {
		WebDriver driver = WebDriverSession.getWebDriverSession();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    GivenLoginPage page = new GivenLoginPage();
		wait.until(ExpectedConditions.visibilityOf(page.banner));
	}
	
	@Given("User navigates to the following page {string}")
	public static void user_navigates_to_the_following_page(String mainPage) {

		WebDriver driver = WebDriverSession.getWebDriverSession();		
		driver.get("http://automationpractice.com/index.php");
		waitUntilPageLoad();
		
	}
	
	@Given("User click on Sign in")
	public static void userclick_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User click sign in");
	    //driver.findElement(By.className("login")).click();
	    GivenLoginPage page = new GivenLoginPage();
	    page.login.click();
	    
	}
	
	//assert examples
	
	public static void hardAssertExaple() {
		WebDriver driver = WebDriverSession.getWebDriverSession();
		Assert.assertEquals("Goooooogle", driver.getTitle());
	}
	
	public static void softAssertExample() {
		GivenLoginPage page = new GivenLoginPage();
		System.out.println("Start: check Results Record: ");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(page.logo.isDisplayed());
		softAssert.assertTrue(page.login.isDisplayed());
		softAssert.assertTrue(page.banner.getText() == "hola");
		softAssert.assertAll();
	}
	

}
