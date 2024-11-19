package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass24_Autosuggestion_amazone {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		
e1.sendKeys("shoe");
Thread.sleep(1000);
List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
Thread.sleep(2000);
int count=li.size();
System.out.println(count);
li.get(count-8).click();
	}

}
