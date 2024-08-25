package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnsPage extends BasePage {
	
	public ReturnsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='input-order-id']")
	WebElement txtOrderID;
	
	@FindBy(xpath="//input[@id='input-date-ordered']")
	WebElement txtOrderDate;

	@FindBy(xpath="//input[@id='input-product']")
	WebElement txtProductName;
	
	@FindBy(xpath="//input[@id='input-model']")
	WebElement txtProductCode;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement txtQuantity;
	
	@FindBy(xpath="//input[@value='3']")
	WebElement rbReason;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement rbProductOpen;
	
	@FindBy(xpath="//textarea[@id='input-comment']")
	WebElement txtComment;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement btnSubmit;

	
	public void setFirstName(String Name)
	{
		txtFirstName.sendKeys(Name);
	}
	
	public void setLastName(String LName)
	{
		txtLastName.sendKeys(LName);
	}
	
	public void setEmail (String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void setPhone(String Phone)
	{
		txtPhone.sendKeys(Phone);
	}
	
	public void setOrderID(String Id)
	{
		txtOrderID.sendKeys(Id);
	}
	
	public void setDate(String Date)
	{
		txtOrderDate.sendKeys(Date);
	}
	
	public void setProductName(String Product)
	{
		txtProductName.sendKeys(Product);
	}
	
	public void setProductCode(String Code)
	{
		txtProductCode.sendKeys(Code);
	}
	
	public void setQuantity(String Q)
	{
		txtQuantity.sendKeys(Q);
	}
	
	public void clickReason()
	{
		rbReason.click();	
	}
	
	public void clickIsOpen() 
	{
		rbProductOpen.click();
	}
	
	public void setComment(String Com)
	{
		txtComment.sendKeys(Com);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
