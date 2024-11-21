package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page 
{
	WebDriver driver;
	//step1
	@FindBy(id="ap_email")
	WebElement username_tf;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password_tf;
	@FindBy(id="auth-signin-button")
	WebElement signin_tologin;
	@FindBy(id="(//a[@class='nav-link nav-item'])[21]")
	WebElement signout;
	//step 2
	public void username ()
	{
	username_tf.sendKeys("8766991366");
	}
	public void login_continue ()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password_tf.sendKeys("supriyakothe");
	}
	public void signintologin()
	{
		signin_tologin.click();
	}
	public void signoutpage ()
		{
			signout.click();
		}
	//step3
	public login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
