package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC007_AddingToCart extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_adding_to_cart()
	{
		HomePage hp = new HomePage(driver);
		hp.SetSearch(p.getProperty("searchProductName"));
		hp.clickSearch();
		
		SearchPage sp = new SearchPage(driver);
		sp.ClickAddToCart();
		
		if(sp.isSuccessAddToCart()==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
				
		
		
	}
	
	
}
