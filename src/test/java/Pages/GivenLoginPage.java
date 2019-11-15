package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverSession;

public class GivenLoginPage {

	public GivenLoginPage() {
		
		PageFactory.initElements(WebDriverSession.getWebDriverSession(), this);
		
	}
	@FindBy (css = ".login")
	public WebElement login;
	
	@FindBy (css = ".banner")
	public WebElement banner;
	
	@FindBy (id = "header_logo")
	public WebElement logo;
	
	
}
