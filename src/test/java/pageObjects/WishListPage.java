package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

	
	public WishListPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='iPhone']")
	WebElement txtWishListProduct;
	
	@FindBy(xpath="//a[@class='btn btn-danger']")
	WebElement btnRemoveWishListProduct;
	
	@FindBy(xpath="//p[normalize-space()='Your wish list is empty.']")
	WebElement txtWishListEmpty;
	
	
	public String getWishListProductName()
	{
		try {
			return (txtWishListProduct.getText());
		} catch (Exception e) {
			return (e.getMessage());
			
		}
	}
	
	public void clickRemoveWishListProduct()
	{
		btnRemoveWishListProduct.click();
	}
	
	public String getWishListEmpty()
	{
		try {
			return (txtWishListEmpty.getText());
		} catch (Exception e) {
			return (e.getMessage());
			
		}
	}
}
