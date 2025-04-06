package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.saucedemo.BaseClass;

public class CheckOutCompletePage extends BaseClass {

	// Initial Remote web driver
	public CheckOutCompletePage(RemoteWebDriver driver) {

		BaseClass.driver = driver;

	}

	// Complete Page Locator
	By title = By.className("title");
	By TickIconBy = By.className("pony_express");
	By Thanksmessage = By.className("complete-header");
	By completetext = By.className("complete-text");
	By BackHome = By.id("back-to-products");
}
