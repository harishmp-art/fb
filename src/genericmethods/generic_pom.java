package genericmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_pom 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://github.com/");
	}
	//@AfterMethod
	//public void closeappln()
	//{
		//driver.quit();
	//}
}
