package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_howerover_language {

	public static void main(String[] args) throws InterruptedException 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2']"));
Actions a1=new Actions(driver);
a1.moveToElement(e1).perform();
Thread.sleep(1000);
WebElement e2=driver.findElement(By.xpath("(//span[@class='nav-text'])[24]"));
e2.click();
	}

}
