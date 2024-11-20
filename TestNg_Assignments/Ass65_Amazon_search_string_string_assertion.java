package TestNg_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass65_Amazon_search_string_string_assertion 
{
	@Test
	public void amazonsearch() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
WebElement e3=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e3).perform();
WebElement e4=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
e4.click();
WebElement e5=driver.findElement(By.id("ap_email"));
e5.sendKeys("8766991366");
WebElement e6=driver.findElement(By.id("continue"));
e6.click();
WebElement e7=driver.findElement(By.id("ap_password"));
e7.sendKeys("harshalkothe");
WebElement e8=driver.findElement(By.id("signInSubmit"));
e8.click();
Thread.sleep(2000);

WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("diyas");
		e1.sendKeys(Keys.ENTER);
		WebElement e9=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2=new Actions(driver);
		a1.moveToElement(e9).perform();	
		WebElement e2=driver.findElement(By.xpath("//span[.='Sign Out']"));
				e2.click();	
Assert.assertEquals(driver.getTitle(),"Amazon Sign In" );
		

		
	}

}
