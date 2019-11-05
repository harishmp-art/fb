package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericmethods.Webdriver_generic;
import genericmethods.generic_pom;
import genericmethods.mousehoverAction;

public class filpkart
{
		@FindBy(xpath="//button[.='✕']")
		private WebElement popup;
		@FindBy(xpath="//span[.='Electronics']")
		private WebElement electo;
		@FindBy(xpath="//a[.='Headphones & Headsets']")
		private WebElement headphone;
		@FindBy(xpath="(//div[@class='LDZ3w-'])[1]")
		private WebElement earphone;
		@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
		private WebElement addcart;
		@FindBy(xpath="//span[.='Cart']")
		private WebElement cart;
		@FindBy(xpath="//a[.='Login & Signup']")
		private WebElement sigin;
		@FindBy(xpath="//span[.='Enter Email/Mobile number']")
		private WebElement un;
		@FindBy(xpath="//input[@type='password']")
		private WebElement pass;
		@FindBy(xpath="(//span[.='Login'])[3]")
		private WebElement log;
		
		
		public filpkart(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void pop()
		{
			popup.click();
			
		}
		
		public void electro(WebDriver driver)
		{
			mousehoverAction m = new mousehoverAction();
			m.mouseover(driver, electo);
			
		}
		public void headp()
		{
			headphone.click();
		}
		public void earp()
		{
			earphone.click();
		}
		//public void nextwind(WebDriver driver)
		//{
		//	Webdriver_generic wd = new Webdriver_generic();
		//	wd.switchto(driver);
		//}
		public void addct()
		{
			addcart.click();
		}
		//public void nextwindmain(WebDriver driver)
		//{
		//	Webdriver_generic wd = new Webdriver_generic();
		//	wd.switchto(driver);
		//}
		public void cartlist(WebDriver driver)
		{
			driver.navigate().back();
			
		}
		public void cart()
		{
			cart.click();
		}
		public void logsign()
		{
			sigin.click();
		}
		public void user()
		{
			un.sendKeys("8050947566");
		}
		public void pass()
		{
			pass.sendKeys("24562456");
		}
		public void log()
		{
			log.click();
		}
		
}
