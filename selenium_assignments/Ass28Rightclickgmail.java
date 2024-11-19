package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass28Rightclickgmail 
{
	public static void main(String[] args) {
		
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
WebElement e1=driver.findElement(By.xpath("(//div[@class='gb_X gb_Z'])[1]"));
Actions a1=new Actions(driver);
a1.contextClick(e1).perform();

}
}
