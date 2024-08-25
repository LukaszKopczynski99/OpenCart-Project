package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BrandSonyPage;
import pageObjects.BrandsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC015_BrandsProductsDisplay extends BaseClass {

	@Test(groups = {"Master"})
	public void verify_displaying_sony_products() 
	{
		HomePage hp = new HomePage(driver);
		hp.clickBrands();
		
		BrandsPage bp = new BrandsPage(driver);
		bp.clickSony();
		
		BrandSonyPage bsp = new BrandSonyPage(driver);
		boolean status = bsp.isBrandDispayed();
		
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
