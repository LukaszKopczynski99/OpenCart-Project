package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {
	
	public EditAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public void setFirstName(String FirstName)
	{
		txtFirstName.clear();
		txtFirstName.sendKeys(FirstName);
	}
	
	public void setLastName(String LastName)
	{
		txtLastName.clear();
		txtLastName.sendKeys(LastName);
	}
	
	public void setTelephone(String Phone)
	{
		txtTelephone.clear();
		txtTelephone.sendKeys(Phone);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
}
