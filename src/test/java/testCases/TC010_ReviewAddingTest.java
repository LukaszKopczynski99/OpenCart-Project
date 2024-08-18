package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC010_ReviewAddingTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void verify_review_adding() throws InterruptedException
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickMacBook();
		
		ProductPage pp = new ProductPage(driver);
		
		pp.clickWriteReview();
		pp.setName(randomeNumber());
		pp.setReview(randomeLongString());
		pp.clickRating();
		pp.clickAddReview();
		
		Thread.sleep(2000);
		
		boolean statusOfReview = pp.msgSuccessReview();
		
		if(statusOfReview==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

}
