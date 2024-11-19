package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass25_Autosuggestion_flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("shoe");
		Thread.sleep(2000);
	List<WebElement> autosuggestion=	driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	int count=autosuggestion.size();
	System.out.println(count);
	autosuggestion.get(count-1).click();
	
		
	}

}
