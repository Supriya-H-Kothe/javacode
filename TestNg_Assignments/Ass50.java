package TestNg_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass50 
{
	@BeforeMethod
	public void test()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void test1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 WebElement e1=driver.findElement(By.linkText("Gmail"));
		 e1.sendKeys(Keys.ENTER);
		 System.out.println("test2");
	}
	@AfterMethod
	public void test3()
	{
		System.out.println("AfterMethod");
		
	}
	
	
	

}
