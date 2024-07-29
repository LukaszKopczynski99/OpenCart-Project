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
	
	public String getConfirmationMsg()
	{
		try {
			return (msgSearch.getText());
		} catch (Exception e) {
			return (e.getMessage());
			
		}
	}
	
}
