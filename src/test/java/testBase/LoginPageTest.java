package testBase;

import org.testng.annotations.Test;

import MyProject.saucedemo.baseClass;
import pageObjectClass.LoginPage;
import utility.TestDataProvider;

public class LoginPageTest extends baseClass{

	LoginPage Login=new LoginPage(driver);
	
	@Test(groups ="smoke")
	void Login() {
		Login.enterTheUserName("standard_user");
		Login.enterThePassword("secret_sauce");
		Login.LoginClick();
		
	}
	
	
	@Test(enabled = false,groups ="regression",dataProvider = "userData", dataProviderClass =TestDataProvider.class )
	void LoginVaildCrential(String User,String Pass) {
		Login.enterTheUserName(User);
		Login.enterThePassword(Pass);
		Login.LoginClick();
		
	}
	

	@Test(enabled=false,groups ="regression",dataProvider = "userInvalidData", dataProviderClass =TestDataProvider.class )
	void LogininVaildCrential(String User,String Pass) {
		Login.enterTheUserName(User);
		Login.enterThePassword(Pass);
		Login.LoginClick();
		
	}
	
	
}
