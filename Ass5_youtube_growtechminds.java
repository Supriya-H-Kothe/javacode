package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass5_youtube_growtechminds {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("growtechminds");
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		
	}

}
