package Practice_Package;

import org.testng.annotations.Test;

public class CreateCustomerTest {

	@Test(dependsOnMethods="updateCustomer")
	public void createCustomer()
	{
		int [] a= {1,2,32};
		
		System.out.println(a[2]);
	}
	@Test()
	public void updateCustomer()
	{
		System.out.println("Customer account updated successfully");
	}
	
	@Test(priority=-1)
	public void deleteCustomer()
	{
		System.out.println("Customer account deleeted successfully");
	}
	
	@Test(enabled=false)
	public void recreateCustomer()
	{
		System.out.println("customer account recreated successfully");
	}
}
