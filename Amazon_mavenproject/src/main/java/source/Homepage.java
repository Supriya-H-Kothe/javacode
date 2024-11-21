package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	WebDriver driver;
	//step1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_button;
	//step2
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist2;
	@FindBy(xpath="(//span[@class='nav-text'])[21]")
	WebElement signout;
	@FindBy(xpath="")
	WebElement Cart_link;
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[10]")
	WebElement yourwishlist;
	@FindBy(xpath="(//span[@class='a-button a-button-base a-button-small'])[5]")
	WebElement removefromwishlist;
	@FindBy(xpath="(//span[@class='nav-text'])[8]")
	WebElement signout2;
	public void acc_list(WebDriver driver)
	{
	Actions a1=new Actions(driver);
	a1.moveToElement(accountandlist).perform();;
	}
	public void signin ()
	{
		signin_button.click();
	}
	public void searching ()
	{
		search_tf.sendKeys("shoe"+Keys.ENTER);
	}
	public void click_cart()
	{
		Cart_link.click();
	}
	public void signoutpage() throws InterruptedException
	{
		Thread.sleep(1000);
		signout.click();
	}
	public void yourwishlist()
	{
		yourwishlist.click();
	}
	public void remove_fromwishlist()
	{
		removefromwishlist.click();
	}
	public void signout2page() throws InterruptedException
	{
		Thread.sleep(1000);
		signout2.click();
	}
	//step3
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
			
	}
}
