package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddAddressBookPage;
import pageObjects.AddressBookPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC012_AddAddressBook extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_adding_address_book() throws InterruptedException 
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage map = new MyAccountPage(driver);
		map.clickAddressBook();
		
		AddressBookPage abp = new AddressBookPage (driver);
		abp.clickNewAddress();
		
		AddAddressBookPage aabp = new AddAddressBookPage(driver);
		
		aabp.setFirstName(randomeString());
		aabp.setLastName(randomeString());
		aabp.setCompany(randomeString());
		aabp.setAddress1(randomeString());
		aabp.setCity(randomeString());
		aabp.setPostCode(randomeString());
		aabp.setCountry(p.getProperty("country"));
		aabp.setRegionState(p.getProperty("region"));
		aabp.clickDefaultAddress();
		aabp.clickContinue();
		
		boolean status = abp.isSuccessfulAddressAdded();
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
