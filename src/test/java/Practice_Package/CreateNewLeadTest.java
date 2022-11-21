package Practice_Package;

import org.testng.annotations.Test;

import POMPages.CreateNewLeadPage;
import POMPages.HomePage;
import POMPages.LeadPage;
import generic.BaseClass;

public class CreateNewLeadTest extends BaseClass {

	@Test
	public void createNewLeadMethod() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.leads();
		
		LeadPage lp=new LeadPage(driver);
		lp.plus();
		
		String firstname = eLib.readDataFromExcel("sheet2", 0, 1);
		String lastname = eLib.readDataFromExcel("sheet2", 1, 1);
		String companyname = eLib.readDataFromExcel("sheet2", 2, 1);
		
		CreateNewLeadPage cnl=new CreateNewLeadPage(driver);
		cnl.createNewLead(firstname, lastname, companyname);
		
	}
	
}
