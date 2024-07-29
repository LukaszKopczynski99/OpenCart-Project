package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC006_SearchTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void verify_search()
	{
		HomePage hp = new HomePage(driver);
		hp.SetSearch(p.getProperty("searchProductName"));
		hp.clickSearch();
		
		SearchPage sp = new SearchPage(driver);
		String search_msg = sp.getConfirmationMsg();
		
		if(search_msg.equalsIgnoreCase("Search - "+(p.getProperty("searchProductName"))))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}
	

}
