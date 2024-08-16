package testCases;

import org.testng.Assert;
import org.testng.annotations.Test ;

import pageObjects.EditAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC011_EditAccountTest extends BaseClass {

	
	@Test(groups={"Regression","Master"})
	public void verify_editing_account_information() throws InterruptedException 
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		hp.clickEditAccount();
		
		EditAccountPage eap = new EditAccountPage(driver);
		
		eap.setFirstName(p.getProperty("newName"));
		Thread.sleep(1000); //only for make it possible to see 
		eap.setLastName(p.getProperty("newSurname"));
		Thread.sleep(1000);
		eap.setTelephone(p.getProperty("newPhone"));
		Thread.sleep(1000);
		
		eap.clickContinue();
		
		MyAccountPage map = new MyAccountPage(driver);
		
		boolean status = map.isMyAccountPageExist();
		if(status == true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		
	}
	
	
	
	
}
