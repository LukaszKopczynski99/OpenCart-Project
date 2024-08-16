package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

	public AddressBookPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Address']")
	WebElement btnNewAddress;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccess;
	
	public void clickNewAddress()
	{
		btnNewAddress.click();
	}
	
	public boolean isSuccessfulAddressAdded()
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
