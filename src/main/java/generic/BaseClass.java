package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMPages.LoginPage;

public class BaseClass 
{
    public DatabaseUtility dLib=new DatabaseUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	/*@BeforeSuite(groups= {"smoke","regression"})
	
	public void connectToDb()throws Throwable
	{
		dLib.connectionToDB();
		System.out.println("connect to database");	
	}*/
//@Parameters("BROWSER")
	@BeforeClass(groups= {"smoke","regression"})

	public void lauchingBrowser()throws Throwable
	{
		String BROWSER=fLib.readDataFromPropertyFileAdmin("browser");
		 String url=fLib.readDataFromPropertyFileAdmin("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();    
		}
		else
		{
			System.out.println("invalid browser");
		}
		driver.get(url);
		wLib.waitForPageLoad(driver);
		sdriver=driver;
		
       wLib.maximiseWindow(driver);
	
		
	}
	@BeforeMethod
	public void loginCredentials() throws Throwable
	{
		String un=fLib.readDataFromPropertyFileAdmin("username");
		String pwd = fLib.readDataFromPropertyFileAdmin("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(un,pwd);
	}
		
		
		   @AfterClass(groups= {"smoke","regression"})
			public void closeBrowser()
			{
				driver.quit();
			}

		   @AfterSuite(groups= {"smoke","regression"})
			public void CloseDb()throws Throwable
			{
				dLib.connectionToDB();
				System.out.println("disconnect to database");	
			}
	
}
