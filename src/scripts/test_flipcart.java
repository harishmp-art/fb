package scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericmethods.generic_pom;
import pom.filpkart;

public class test_flipcart
{
 @Test
 public void test() throws InterruptedException
 {
	 System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	 filpkart ip = new filpkart(driver);
	 ip.pop();
	 ip.electro(driver);
	 Thread.sleep(3000);
	 ip.headp();
	 Thread.sleep(3000);
	 ip.earp();
	 Thread.sleep(3000);
	 //ip.nextwind(driver);
	 //Thread.sleep(3000);
	 ip.addct();
	 Thread.sleep(3000);
	 //ip.nextwindmain(driver);
	 //Thread.sleep(3000);
	 ip.cartlist(driver);
	 Thread.sleep(3000);
	 ip.cart();
	 Thread.sleep(3000);
	 //ip.logsign();
	// Thread.sleep(3000);
	// ip.user();
	 //Thread.sleep(3000);
	 //ip.pass();
	 //Thread.sleep(3000);
	 //ip.log();
	 
	 
 }
}
