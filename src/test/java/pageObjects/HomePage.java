package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement inputSearch;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	@FindBy(xpath="//span[normalize-space()='Wish List (1)']")
	WebElement btnWishList;
	
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	WebElement btnCurrencySwitch;
	
	@FindBy(xpath="//button[contains(text(),'€Euro')]")
	WebElement btnCurrencyEuro;
	
	@FindBy(xpath="//p[@class='price']")
	WebElement txtItemsPrice;
	
	@FindBy(xpath="//img[@title='MacBook']")
	WebElement imgMacBook;
	
	@FindBy(xpath="//a[normalize-space()='Edit Account']")
	WebElement btnEditAccount;
	
	@FindBy(xpath="//a[normalize-space()='About Us']")
	WebElement lnkAboutUs;
	
	@FindBy(xpath="//a[normalize-space()='Delivery Information']")
	WebElement lnkDeliveryInformation;
	
	@FindBy(xpath="//a[normalize-space()='Privacy Policy']")
	WebElement lnkPrivacyPolicy;
	
	@FindBy(xpath="//a[normalize-space()='Terms & Conditions']")
	WebElement lnkTermsConditions;

	public void clickMyAccount()
	{
		lnkMyaccount.click();	
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}

	public void SetSearch(String s)
	{
		inputSearch.sendKeys(s);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}

	public void clickWishList()
	{
		btnWishList.click();
	}
	
	public void clickCurrencySwitch()
	{
		btnCurrencySwitch.click();
	}
	
	public void clickCurrencyEuro() 
	{
		btnCurrencyEuro.click();
	}
	
	public String getItemsPrice()
	{
		try {
			return (txtItemsPrice.getText());
		} catch (Exception e) {
			return (e.getMessage());
			
		}
	}
	
	public void clickMacBook()
	{
		imgMacBook.click();
	}
	
	public void clickEditAccount()
	{
		btnEditAccount.click();
	}
	
	public void clickAboutUs()
	{
		lnkAboutUs.click();
	}
	
	public void clickDeliveryInformation()
	{
		lnkDeliveryInformation.click();
	}
	
	public void clickPrivacyPolicy()
	{
		lnkPrivacyPolicy.click();
	}
	
	public void clickTermsConditions()
	{
		lnkTermsConditions.click();
	}
	
}
