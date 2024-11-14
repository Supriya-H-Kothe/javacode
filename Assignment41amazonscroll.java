package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment41amazonscroll {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.linkText("About Amazon"));
		Point pi=e1.getLocation();
		int x=pi.getX();
		int y=pi.getY();
		JavascriptExecutor j1=driver;
		j1.executeScript("window.scrollBy(0,"+y+")");
	}

}
