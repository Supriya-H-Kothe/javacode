package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass30_Findlinks_Printlinks_getattribute_href {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		for(int i=0;i<315;i++)
		{
		WebElement e1=li.get(i);
		String s1=e1.getAttribute("id");
		System.out.println(s1);
		}
	}

}
