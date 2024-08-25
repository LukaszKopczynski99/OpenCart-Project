package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandSonyPage extends BasePage {

	public BrandSonyPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Sony']")
	WebElement  msgSony;
	
	public boolean isBrandDispayed()
	{
		try {
			return (msgSony.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
}
