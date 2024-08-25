package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductReturnsPage;
import pageObjects.ReturnsPage;
import testBase.BaseClass;

public class TC014_ReturningOrderTest extends BaseClass {

	
	@Test(groups = {"Master"})
	public void verify_returning_an_order() 
	{
		HomePage hp = new HomePage(driver);
		hp.clickReturns();
		
		ReturnsPage rp = new ReturnsPage(driver);
		rp.setFirstName(randomeString());
		rp.setLastName(randomeString());
		rp.setEmail(randomeString()+"@op.pl");
		rp.setPhone(randomeNumber());
		rp.setOrderID(randomeNumber());
		rp.setDate("2024-10-10");
		rp.setProductName(randomeString());
		rp.setProductCode(randomeNumber());
		rp.setQuantity(randomeNumber());
		rp.clickReason();
		rp.clickIsOpen();
		rp.setComment(randomeLongString());
		rp.clickSubmit();
		
		ProductReturnsPage prp = new ProductReturnsPage(driver);
		boolean status = prp.isMsgDispayed();
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
