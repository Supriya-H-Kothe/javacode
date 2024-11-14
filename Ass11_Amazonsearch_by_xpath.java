package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass11_Amazonsearch_by_xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazone.com");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("pen");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).sendKeys(Keys.ENTER);

		
	}

}
