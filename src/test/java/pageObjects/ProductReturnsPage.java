package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnsPage extends BasePage {
	
	public ProductReturnsPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//p[contains(text(),'Thank you for submitting your return request.')]")
	WebElement msgSuccess;
	
	
	public boolean isMsgDispayed()
	{
		try {
			return (msgSuccess.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
	

	
	

}
