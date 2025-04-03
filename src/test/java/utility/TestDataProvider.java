package utility;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "userData")
	public Object[][] provideLoginValidTestData() {
		return new Object[][] {
				// Valid username-password combinations with domains
				{ "standard_user@example.com", "secret_sauce" }, { "locked_out_user@company.com", "secret_sauce" },
				{ "problem_user@domain.com", "secret_sauce" },
				{ "performance_glitch_user@service.com", "secret_sauce" },
				{ "error_user@platform.com", "secret_sauce" }, { "visual_user@domain.co", "secret_sauce" },

		};
	}

	@DataProvider(name = "userInvalidData")
	public Object[][] provideLoginInvalidTestData() {
		return new Object[][] {

				// Invalid username-password combinations with domains
				{ "invalid_user@xyz.com", "secret_sauce" }, // Invalid username with domain
				{ "standard_user@example.com", "wrong_password" }, // Valid username with wrong password
				{ "locked_out_user@company.com", "wrong_password" }, // Valid username with wrong password
				{ "problem_user@domain.com", "wrong_password" }, // Valid username with wrong password
				{ "performance_glitch_user@service.com", "wrong_password" }, // Valid username with wrong password
				{ "error_user@platform.com", "wrong_password" }, // Valid username with wrong password
				{ "visual_user@domain.co", "wrong_password" }, // Valid username with wrong password

				// Blank username or password scenarios with domains
				{ "", "secret_sauce" }, // Blank username with domain
				{ "standard_user@example.com", "" }, // Blank password
				{ "", "" }, // Blank username and password
		};
	}
}
