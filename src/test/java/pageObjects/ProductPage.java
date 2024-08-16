package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	
	
	
	public ProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Write a review']")
	WebElement lnkWriteReview;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement txtName;
	
	@FindBy(xpath="//textarea[@id='input-review']")
	WebElement txtReview;
	
	@FindBy(xpath="//input[@value='3']")
	WebElement btnRating;

	@FindBy(xpath="//button[@id='button-review']")
	WebElement btnAddReview;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgAddingReview;
	
	public void clickWriteReview()
	{
		lnkWriteReview.click();
	}
	
	public void setName(String Name)
	{
		txtName.sendKeys(Name);
	}
	
	public void setReview(String Review)
	{
		txtReview.sendKeys(Review);
	}
	
	public void clickRating()
	{
		btnRating.click();
	}
	
	public void clickAddReview()
	{
		btnAddReview.click();
	}
	
	public boolean msgSuccessReview()
	{
		 return msgAddingReview.isDisplayed();
	}
	
	
}
