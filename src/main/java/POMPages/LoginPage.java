package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement usernameTxtEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordTxtEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsernameTxtEdt() {
		return usernameTxtEdt;
	}

	public WebElement getPasswordTxtEdt() {
		return passwordTxtEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String username,String password)
	{
		usernameTxtEdt.sendKeys(username);
		passwordTxtEdt.sendKeys(password);
		loginBtn.click();
	}
	
	
}
