package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automategrotechmind_rightclick {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/rightclick/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Practice Link1"));
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
//e1.click();

	}

}
