package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.AccountLogoutPage;
import testBase.BaseClass;

public class TC004_LogoutTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_logout() {
		logger.info("*** Statring TC004_LogoutTest ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();

			MyAccountPage macc = new MyAccountPage(driver);
			macc.clickLogout();
			
			AccountLogoutPage al = new AccountLogoutPage(driver);
			boolean targetMsg = al.isMyLogoutPageExist();

			if (targetMsg == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail();
		}
		
	logger.info("**** Finished TC_004_LogoutTest *****");
	}


}

