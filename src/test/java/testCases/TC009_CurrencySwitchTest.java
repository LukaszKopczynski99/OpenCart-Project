package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC009_CurrencySwitchTest extends  BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_currency_switch()
	{
		
		HomePage hp = new HomePage(driver);
		
		hp.clickCurrencySwitch();
		hp.clickCurrencyEuro();
		
		if(hp.getItemsPrice().contains("€"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
		
	}
	
}
