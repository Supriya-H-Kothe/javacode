package Ass69_Parallelbrowser_testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Addtocart extends Launch_quit
{
	@Test
	public void method() throws InterruptedException 
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement e2=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	    e2.click();
	    Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		WebElement e3=driver.findElement(By.id("add-to-cart-button"));
		e3.click();
	}
}
