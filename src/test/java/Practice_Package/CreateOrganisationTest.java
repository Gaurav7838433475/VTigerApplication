package Practice_Package;

import org.testng.annotations.Test;

import POMPages.CreateNewOrganisationPage;
import POMPages.HomePage;
import POMPages.OrganisationListPage;
import generic.BaseClass;

public class CreateOrganisationTest extends BaseClass {

	@Test
	public void createOrg() throws Throwable 
	{
		HomePage hp=new HomePage(driver);
		hp.organisation();
		OrganisationListPage olp=new OrganisationListPage(driver);
		olp.clickPlusOrg();
		wLib.waitForPageLoad(driver);
		String orgName = eLib.readDataFromExcel("Sheet1", 7, 2);
		String orgName1 = eLib.readDataFromExcel("Sheet1", 7, 3);
		String orgName2 = eLib.readDataFromExcel("Sheet1", 7, 4);
		CreateNewOrganisationPage crOrg=new CreateNewOrganisationPage(driver);
		crOrg.createOrganisation(orgName,orgName1,orgName2);
		
	}
	
}
