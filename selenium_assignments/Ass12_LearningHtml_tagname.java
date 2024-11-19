package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass12_LearningHtml_tagname {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BusinessComputers.In/Desktop/learningHTML1%20-%20Copy.html");
		WebElement e1=driver.findElement(By.tagName("input"));
			e1.sendKeys("supriya@gmail.com");
		e1.click();
		WebElement e2=driver.findElement(By.tagName("input"));
		e2.sendKeys("form");
		WebElement e3=driver.findElement(By.tagName("input"));
		e3.sendKeys("1234");
		WebElement e4=driver.findElement(By.tagName("input"));
		e4.sendKeys("supriya");
		WebElement e6=driver.findElement(By.tagName("input"));
		e6.click();
		WebElement e7=driver.findElement(By.tagName("input"));
		e7.click();
		WebElement e9=driver.findElement(By.tagName("input"));
		e9.click();
		WebElement e10=driver.findElement(By.tagName("input"));
		e10.click();
		WebElement e11=driver.findElement(By.tagName("input"));
		e11.click();
		WebElement e12=driver.findElement(By.tagName("input"));
		e12.click();


	}

}
