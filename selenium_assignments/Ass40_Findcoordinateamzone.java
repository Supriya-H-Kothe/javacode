package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass40_Findcoordinateamzone {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("www.amazon.in");
WebElement e1=driver.findElement(By.linkText("About Amazon"));
Point pi=e1.getLocation();
int x=pi.getX();
int y=pi.getY();
System.out.println(x);
System.out.println(y);

		
	}

}
