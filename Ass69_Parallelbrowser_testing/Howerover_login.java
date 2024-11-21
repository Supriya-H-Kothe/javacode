package Ass69_Parallelbrowser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Howerover_login extends Launch_quit
{
	@Test
	public void Howerover_login() throws InterruptedException 
	{
		
	WebElement e3=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e3).perform();
WebElement e4=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
e4.click();
WebElement e5=driver.findElement(By.id("ap_email"));
e5.sendKeys("supriyafule27@gmail.com");
WebElement e6=driver.findElement(By.id("continue"));
e6.click();
Thread.sleep(1000);
WebElement e7=driver.findElement(By.id("ap_password"));
e7.sendKeys("harshal");
WebElement e8=driver.findElement(By.id("signInSubmit"));
e8.click();
	}
}
