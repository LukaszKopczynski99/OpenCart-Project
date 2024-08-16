package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage  {

	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Search - iPhone']")
	WebElement msgSearch;
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
	WebElement btnSearch;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccessAddedToCart;
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[2]")
	WebElement btnAddToWishList;

	
	public String getConfirmationMsg()
	{
		try {
			return (msgSearch.getText());
		} catch (Exception e) {
			return (e.getMessage());
			
		}
	}
	
	public void ClickAddToCart () {
		btnSearch.click();
	}
	
	public Boolean isSuccessAddToCart()
	{
		return msgSuccessAddedToCart.isDisplayed();
	}
	
	public void clickAddToWishList()
	{
		btnAddToWishList.click();
	}
	
	
}
	

