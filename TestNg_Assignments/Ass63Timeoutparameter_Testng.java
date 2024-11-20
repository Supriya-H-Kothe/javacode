package TestNg_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass63Timeoutparameter_Testng 
{
	@Test(timeOut=1000)
	public void NegativePriority()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

}
