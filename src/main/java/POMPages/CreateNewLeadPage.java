package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {

	@FindBy(name="firstname")
	private WebElement firstNameTxtEdit;
	
	@FindBy(name="lastname")
	private WebElement lastnameTxtEdit;
	
	@FindBy(name="company")
	private WebElement companyTxtEdit;
	
	@FindBy(name="button")
	private WebElement saveBtn;
	
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstNameTxtEdit() {
		return firstNameTxtEdit;
	}

	public WebElement getLastnameTxtEdit() {
		return lastnameTxtEdit;
	}

	public WebElement getCompanyTxtEdit() {
		return companyTxtEdit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createNewLead(String firstname,String lastname,String company)
	{
		firstNameTxtEdit.sendKeys(firstname);
		lastnameTxtEdit.sendKeys(lastname);
		companyTxtEdit.sendKeys(company);
		saveBtn.click();
	}
	
	
}
