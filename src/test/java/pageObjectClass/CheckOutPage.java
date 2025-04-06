package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.saucedemo.BaseClass;

public class CheckOutPage extends BaseClass {

	// initial RemoteWebDriver
	public CheckOutPage(RemoteWebDriver driver) {

		BaseClass.driver = driver;

	}

	// CheckOutPage Locators
	By CheckOutPageTitle = By.className("title");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By cancel = By.id("cancel");
	By Continue = By.id("continue");

}
