package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.WishListPage;
import testBase.BaseClass;

public class TC008_AddingToWishListTest extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_adding_to_wish_list()
	{
		HomePage hp = new HomePage(driver);
		 	
		hp.clickMyAccount();
		hp.clickLogin();
			
			
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();	
		
	
		hp.SetSearch(p.getProperty("searchProductName"));
		hp.clickSearch();
		
		SearchPage sp = new SearchPage(driver);
		sp.clickAddToWishList();
		
		hp.clickWishList();
		
		WishListPage wlp = new WishListPage(driver);
		
		if(wlp.getWishListProductName().equalsIgnoreCase(p.getProperty("searchProductName")))
		{
			wlp.clickRemoveWishListProduct();
			if(wlp.getWishListEmpty().equals("Your wish list is empty."))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}
	
	
}
