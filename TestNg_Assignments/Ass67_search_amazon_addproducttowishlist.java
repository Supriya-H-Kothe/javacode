package TestNg_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ass67_search_amazon_addproducttowishlist 
{
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void testcase(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http:/www.amazon.in");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
        WebElement e2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        e2.click();
        Thread.sleep(1000);
        Set <String> s1=driver.getWindowHandles();
        Iterator <String> i1=s1.iterator();
        String Parentid =i1.next();
        String Childid=i1.next();
        driver.switchTo().window(Childid);
        Thread.sleep(1000);
        WebElement e3=driver.findElement(By.xpath("//div[@class='a-button-group a-declarative a-spacing-none']"));
        e3.click();
        
}
}
