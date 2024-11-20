package TestNg_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass72_Implicit_wait {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Duration is final class and ofseconds is its static method name
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
