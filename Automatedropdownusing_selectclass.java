package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automatedropdownusing_selectclass {

	public static void main(String[] args)
	{
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("searchDropdownBox"));
Select s1=new Select(e1);
s1.selectByIndex(10);
WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
e2.sendKeys("power of mind");
WebElement e3=driver.findElement(By.id("nav-search-submit-button"));
e3.click();




	}

}
