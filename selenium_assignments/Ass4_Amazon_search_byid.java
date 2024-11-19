package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass4_Amazon_search_byid 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazone.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		
		
		}

}
