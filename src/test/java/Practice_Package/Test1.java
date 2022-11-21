package Practice_Package;

import org.testng.annotations.Test;

public class Test1 {

	@Test(invocationCount=-1)
	public void login()
	{
		System.out.println("hii");
	}
	
	@Test(priority=-2)
	public void logout()
	{
		System.out.println("hello");
	}
	
	@Test(invocationCount=0,priority=1)
	public void classopt()
	{
		System.out.println("bye");
	}
}
