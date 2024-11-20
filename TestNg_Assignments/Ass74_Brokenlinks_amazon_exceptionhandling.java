package TestNg_Assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ass74_Brokenlinks_amazon_exceptionhandling
{
	public static void main(String[] args) throws IOException 
	{
	ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);
		String url=e1.getAttribute("href");
		System.out.println(url);
		verifylinks(url);
		}
	}
	static void verifylinks(String url) throws IOException
	{
		try
		{
		URL u1=new URL(url);
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
	
	if (u2.getResponseCode()==200)
	{
		System.out.println("Link is valid"+url+"   "+u2.getResponseMessage());
	}
	else
	{
	System.out.println("Link is not  valid"+url+"    "+u2.getResponseMessage());
	}
		}
	catch(MalformedURLException m1)	
		{
		System.out.println("Handled the exception");
		}

}
}
