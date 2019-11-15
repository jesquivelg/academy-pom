package test;

import stepDefinitions.GivenLogin;

public class TestExample {
	
	@org.testng.annotations.Test
	public void Test() {
		//GivenLogin.user_opens_the_browser();
		
		GivenLogin.user_navigates_to_the_following_page("");
		//GivenLogin.userclick_on_Sign_in();
		
		GivenLogin.softAssertExample();
		//GivenLogin.hardAssertExaple();
	}
	public void Test2() {
		GivenLogin.hardAssertExaple();
	}
}
