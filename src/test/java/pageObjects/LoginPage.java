package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement btnForgottenPassword;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgEmailConfirmation;
	
	public void setEmail(String Email)
	{
		txtEmailAddress.sendKeys(Email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickForgottenPassword()
	{
		btnForgottenPassword.click();
	}
	
	public boolean isMyMsgEmialConfirm()
	{
		try {
			return (msgEmailConfirmation.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
	

}


