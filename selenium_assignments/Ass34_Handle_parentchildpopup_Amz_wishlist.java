package selenium_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass34_Handle_parentchildpopup_Amz_wishlist {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
         e1.sendKeys("mobile"+Keys.ENTER);
         Thread.sleep(1000);
         WebElement e2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
         e2.click();
         Thread.sleep(1000);
         Set <String> s1=driver.getWindowHandles();
         Iterator <String> i1=s1.iterator();
         String Parentid =i1.next();
         String Childid=i1.next();
         driver.switchTo().window(Childid);
         Thread.sleep(1000);
         WebElement e3=driver.findElement(By.xpath("//div[@class='a-button-group a-declarative a-spacing-none']"));
         e3.click();
         
         
	}

}
