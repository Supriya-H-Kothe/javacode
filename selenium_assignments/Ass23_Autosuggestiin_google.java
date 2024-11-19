package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass23_Autosuggestiin_google {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Nagpur");
		Thread.sleep(2000);
	List<WebElement> autosuggestion=	driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	int count=autosuggestion.size();
	System.out.println(count);
	autosuggestion.get(count-1).click();
	
	}

}
