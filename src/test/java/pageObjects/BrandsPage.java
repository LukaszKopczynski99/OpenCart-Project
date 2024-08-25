package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandsPage extends BasePage {

	public BrandsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Sony']")
	WebElement lnkSony;
	
	public void clickSony()
	{
		lnkSony.click();
	}
	
	
}
