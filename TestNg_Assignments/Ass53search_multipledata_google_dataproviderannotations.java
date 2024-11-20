package TestNg_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass53search_multipledata_google_dataproviderannotations
{
	@DataProvider(name="set1")
	public Object[][] method1()
	{
		return new Object[][] {{"India"},{"US"},{"Japan"}};
		}
		@Test(dataProvider="set1")
		public void search(String input)
		{
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			driver.findElement(By.name("q")).sendKeys(input);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
	}

