package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutPage extends BasePage {

	
	public AccountLogoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	WebElement msgLogoutHeading;
	
	public boolean isMyLogoutPageExist()
	{
		try {
			return (msgLogoutHeading.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
}
