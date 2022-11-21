package Practice_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsProg {

	@AfterMethod
	public void method1()
	{
		System.out.println("======AfterMethod=====");
	}
	@BeforeMethod
	public void method2()
	{
		System.out.println("======BeforeMethod======");
	}
	
	@AfterSuite
	public void method3()
	{
		System.out.println("======AftreSuite=====");
	}
	@BeforeSuite
	public void method4()
	{
		System.out.println("------BeforeSuite------");
	}
	@BeforeClass
	public void method5()
	{
		System.out.println("========BeforeClass======");
	}
	@AfterClass
	public void method6()
	{
		System.out.println("=======AfterClass=====");
	}
	@Test
	public void Method7()
	{
		System.out.println("====Method7=====");
	}
	@Test
	public void Method6()
	{
		System.out.println("======method 6========");
	}
}
