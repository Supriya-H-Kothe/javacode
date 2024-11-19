package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass29_find_numberoflinks_printlink_text_google {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	List<WebElement>	li=driver.findElements(By.tagName("a"));
	int count=li.size();
	System.out.println(count);
	for(int i =0;i<count;i++)
	{
	WebElement e1=li.get(i);
	String s1=e1.getText();
	System.out.println(s1);
	
	}
	}
}


