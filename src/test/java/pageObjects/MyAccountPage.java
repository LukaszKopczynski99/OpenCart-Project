package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccess;
	
	@FindBy(xpath="//a[normalize-space()='Address Book']")
	WebElement btnAddressBook;
	
	public boolean isMyAccountPageExist()
	{
		try {
			return (msgHeading.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	public boolean isSuccessfulAccountUpdate()
	{
		try {
			return (msgSuccess.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public void clickAddressBook()
	{
		btnAddressBook.click();
	}
}
