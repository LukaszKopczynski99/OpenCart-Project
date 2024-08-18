package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutUsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC013_InformationTest extends BaseClass {

	HomePage hp;
	
	@Test(groups = {"Master"})
	public void verify_about_us_information_section() 
	{
		hp = new HomePage(driver);
		hp.clickAboutUs();
		
		AboutUsPage aup = new AboutUsPage(driver);
		boolean aupStatus = aup.isMyPageExist();
		if(aupStatus==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);		
		}	
	}
	
	
		
	
}
