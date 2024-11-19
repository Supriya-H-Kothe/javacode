package selenium_assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass8_getwindowhandle {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String e1=driver.getWindowHandle();
System.out.println(e1);
	}

}
