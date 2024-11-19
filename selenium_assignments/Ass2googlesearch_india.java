package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2googlesearch_india {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("BtnK")).click();//if it is not perform action
		
	}

}
