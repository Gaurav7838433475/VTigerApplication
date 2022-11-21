package Practice_Package;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathss {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("http://localhost:8888/index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		WebElement ele = driver.findElement(By.name("industry"));
		Select sel=new Select(ele);
		TreeSet<String> set=new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> option = sel.getOptions();
		for(WebElement webelement:option)
		{
			String text=webelement.getText();
			set.add(text);
		}
		
		for(String altext:set)
		{
			System.out.println(altext);
		}
	}

}
