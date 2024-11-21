package Ass69_Parallelbrowser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_quit 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launch(String nameofbrowser)throws InterruptedException
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
     }
@AfterMethod
public void quit() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}
}
