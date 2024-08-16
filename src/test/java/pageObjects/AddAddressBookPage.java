package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddAddressBookPage extends BasePage {

	
	public AddAddressBookPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-company']")
	WebElement txtCompany;
	
	@FindBy(xpath="//input[@id='input-address-1']")
	WebElement txtAddress1;
	
	@FindBy(xpath="//input[@id='input-city']")
	WebElement txtCity;
	
	@FindBy(xpath="//input[@id='input-postcode']")
	WebElement txtPostCode;
	
	@FindBy(xpath="//select[@id='input-country']")
	WebElement SelectCountry;
	
	@FindBy(xpath="//select[@id='input-zone']")
	WebElement SelectRegionState;
	
	@FindBy(xpath="//input[@value='0']")
	WebElement rbDefaultAddress;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public void setFirstName(String Name)
	{
		txtFirstName.sendKeys(Name);
	}
	
	public void setLastName(String LName)
	{
		txtLastName.sendKeys(LName);
	}
	
	public void setCompany(String Company)
	{
		txtCompany.sendKeys(Company);
	}
	
	public void setAddress1(String Address1)
	{
		txtAddress1.sendKeys(Address1);
	}
	
	public void setCity(String City)
	{
		txtCity.sendKeys(City);
	}
	
	public void setPostCode(String PostCode)
	{
		txtPostCode.sendKeys(PostCode);
	}
	
	public void setCountry(String country)
	{
		Select select = new Select(SelectCountry);
		select.selectByVisibleText(country);
	}
	
	public void setRegionState(String RS)
	{
		Select select = new Select(SelectRegionState);
		select.selectByVisibleText(RS);
	}
	
	public void clickDefaultAddress()
	{
		rbDefaultAddress.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	
}
