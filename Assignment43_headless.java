package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment43_headless {

	public static void main(String[] args)
	{
		ChromeOptions c1=new ChromeOptions();
		c1.addArguments("--headless");
ChromeDriver driver=new ChromeDriver(c1);
driver.get("http://www.google.com");
driver.manage().window().maximize();



	}

}
