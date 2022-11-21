package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationListPage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement plusBtn;
	
	public OrganisationListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}
	
	public void clickPlusOrg()
	{
		plusBtn.click();
	}
}
