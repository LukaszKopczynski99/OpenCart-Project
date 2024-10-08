package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("*** Statring TC002_LoginTest ***");
		try {
			HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean status = map.isMyAccountPageExist();
		Assert.assertEquals(status, true, "Login failed");
		}
		catch(Exception e)
		{
			System.out.println(e);
			Assert.fail();
		}
		
		logger.info("*** Finished TC002_LoginTest ***");
	}
	
	
	
}
