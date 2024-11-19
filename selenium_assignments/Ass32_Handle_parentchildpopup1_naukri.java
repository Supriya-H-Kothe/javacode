package selenium_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass32_Handle_parentchildpopup1_naukri {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.name("google-register"));
		e1.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String Parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();
	}

}
