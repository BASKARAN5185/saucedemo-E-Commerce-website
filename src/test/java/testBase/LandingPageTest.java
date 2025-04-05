package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.saucedemo.BaseClass;
import pageObjectClass.LandingPage;
import pageObjectClass.LoginPage;

public class LandingPageTest extends BaseClass {

	LandingPage HomePage = new LandingPage(driver);
	LoginPage Login = new LoginPage(driver);

	// Login Test
	@Test(enabled = true, priority = 1, groups = "smoke")
	void Login() {
		Login.enterTheUserName("standard_user");
		Login.enterThePassword("secret_sauce");
		Login.LoginClick();

	}

	@Test()
	public void VerifytheHomePage() {

		Assert.assertEquals(true, HomePage.AppLogo());

	}

	@Test()
	public void clickTheMenuverified() {

		Assert.assertTrue(HomePage.clickTheMenuIcon());

	}

	@Test()
	public void clickTheclose() {

		Assert.assertTrue(HomePage.clickTheMenuClose());

	}

	@Test()
	public void clickTheAllItemMenu() {
		Assert.assertTrue(HomePage.clickTheMenuIcon());
		Assert.assertTrue(HomePage.clickTheMenuAllItems());

	}

	@Test(enabled = false)
	public void clickThelogot() {
		Assert.assertTrue(HomePage.clickTheMenulogout());

	}
	
	@Test(enabled = false)
	public void clickTheMenuAbout() {
		Assert.assertTrue(HomePage.clickTheMenuAbout());

	}

	@Test()
	public void clickTheAppStoreReset() {
		Assert.assertTrue(HomePage.clickTheMenuResetAppstore());

	}

	@Test()
	public void ProductTitleIsVisiable() {
		Assert.assertTrue(HomePage.ProductTitle());

	}

	@Test
	public void ShortTheProductNameAZ() {
		HomePage.testSortByNameAZ();
	}

	@Test
	public void ShortTheProductNameZA() {
		HomePage.testSortByNameZA();
	}

	@Test
	public void ShortTheProductHighToLow() {
		HomePage.testSortByPriceHighToLow();
	}

	@Test
	public void ShortTheProductLowToHigh() {
		HomePage.testSortByPriceLowToHigh();
	}

	@Test
	public void CartIconIsVisible() {
		HomePage.addToCartIconIsVisiable();
	}

}
