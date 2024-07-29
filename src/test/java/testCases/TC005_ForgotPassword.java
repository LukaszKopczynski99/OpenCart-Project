package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgottenPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC005_ForgotPassword extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_forgotten_password() {
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin(); // Login link under MyAccount

			LoginPage lp = new LoginPage(driver);
			lp.clickForgottenPassword();

			ForgottenPasswordPage fp = new ForgottenPasswordPage(driver);
			fp.setEmail(p.getProperty("email"));
			fp.clickContinue();

			boolean conf_email = lp.isMyMsgEmialConfirm();

			if (conf_email == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail();
		}

	}
}


