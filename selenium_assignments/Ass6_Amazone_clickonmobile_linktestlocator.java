package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass6_Amazone_clickonmobile_linktestlocator {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
WebElement e1=driver.findElement(By.linkText("Mobiles"));
e1.click();



	}

}
