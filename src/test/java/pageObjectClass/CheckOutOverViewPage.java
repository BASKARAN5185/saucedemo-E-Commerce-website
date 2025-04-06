package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.saucedemo.BaseClass;

public class CheckOutOverViewPage extends BaseClass {

	// Initial RemoteWebdriver
	public CheckOutOverViewPage(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// Overview Page Locators
	By title = By.className("title");
	By PaymentInformation=By.className("(//div[@class='summary_value_label'])[1]");
	By ShoppingInformation =By.className("(//div[@class='summary_value_label'])[2]");
	By ItemTotal=By.className("summary_subtotal_label");
	By Tax =By.className("summary_tax_label");
	By totlal=By.className("summary_total_label");
	By cancel=By.id("cancel");
	By finish=By.id("finish");
}
