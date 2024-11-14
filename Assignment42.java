package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment42 {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.youtube.com");
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		Point pi=e1.getLocation();
		int x=pi.getX();
		int y=pi.getY();
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(2000);
		x=x+300;
		JavascriptExecutor j1=driver;
		while(y>10)
		{
			y=y+4000;
		j1.executeScript("window,scrollBy(0,"+y+")");
		
 
	}
	}
}



