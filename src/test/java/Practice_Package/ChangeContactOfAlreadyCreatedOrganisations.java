package Practice_Package;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeContactOfAlreadyCreatedOrganisations {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.name("search_text")).sendKeys("testyantra52");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("136")).click();
		driver.findElement(By.linkText("edit")).click();
		
	}

}
