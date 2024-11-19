package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;


public class Ass1_Launch_Browser 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.zoom.com");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
