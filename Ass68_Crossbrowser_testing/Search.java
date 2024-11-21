package Ass68_Crossbrowser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search extends Launch_quit
{
	@Test
	public void method() 
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
	}

}
