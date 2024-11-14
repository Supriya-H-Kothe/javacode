package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass7_Amazone_searchbypartiallinktest {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
WebElement e1=driver.findElement(By.partialLinkText("Home"));
e1.click();

	}

}
