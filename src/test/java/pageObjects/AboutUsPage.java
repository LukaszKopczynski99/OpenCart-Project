package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {
	
	public AboutUsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='About Us']")
	WebElement msgTitle;
	
	public boolean isMyPageExist()
	{
		try {
			return (msgTitle.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
	

}
