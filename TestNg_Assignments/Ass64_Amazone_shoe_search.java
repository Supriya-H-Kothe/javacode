package TestNg_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass64_Amazone_shoe_search
{
	@Test
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		
e1.sendKeys("shoe");
Thread.sleep(1000);
e1.sendKeys(Keys.ENTER);

List<WebElement> li=driver.findElements(By.tagName("a"));
	int count=li.size();
	System.out.println(count);
Assert.assertEquals(li.size()>50,false);
	}

}
