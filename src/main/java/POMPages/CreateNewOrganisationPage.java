package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtility;

public class CreateNewOrganisationPage extends WebDriverUtility{

	@FindBy(name="accountname")
	private WebElement OrganisationNameTxtEdit;
	
	@FindBy(name="assigntype")
	private WebElement groupRadioBtn;
	
	@FindBy(name="button")
	private WebElement saveBtn;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropdown;
	
	public CreateNewOrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganisationNameTxtEdit() {
		return OrganisationNameTxtEdit;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createOrganisation(String orgname)
	{
		OrganisationNameTxtEdit.sendKeys(orgname);
		saveBtn.click();
	}
	
	public void createOrganisation(String orgname,String indType)
	{
		OrganisationNameTxtEdit.sendKeys(orgname);
		selectByVisibleText(industryDropDown,indType);
		saveBtn.click();
	}
	
	public void createOrganisation(String orgname,String indType,String accType)
	{
		OrganisationNameTxtEdit.sendKeys(orgname);
		selectByVisibleText(industryDropDown,indType);
		selectByVisibleText(typeDropdown,accType);
		saveBtn.click();
	}
}
