package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipend3
{
	@FindBy(xpath="(//li[@class='col col-6-12'])[1]")
	
	private WebElement addcart;
	@FindBy(xpath="//span[.='Cart']")
	private WebElement cart;
	public flipend3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addcart() throws InterruptedException
	{
		addcart.click();
		Thread.sleep(3000);
		cart.click();
		
	}
}
