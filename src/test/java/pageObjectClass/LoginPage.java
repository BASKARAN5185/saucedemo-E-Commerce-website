package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.saucedemo.baseClass;

public class LoginPage extends baseClass {

	// Initialize RemoteWebDriver
	public LoginPage(RemoteWebDriver driver) {

		baseClass.driver = driver;

	}

	// Login Page Locators
	By userName = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");

	// Element Action Class

	// Enter the username into the field
	public void enterTheUserName(String name) {
		driver.findElement(userName).sendKeys(name);

	}

	// Enter the Password into the field
	public void enterThePassword(String psw) {
		driver.findElement(password).sendKeys(psw);

	}

	// Click the Login Button
	public void LoginClick() {
		driver.findElement(loginButton).click();
	}

	// Enter the username into the field
	public void Login(String name, String psw) {
		driver.findElement(userName).sendKeys(name);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginButton);
	}

}
