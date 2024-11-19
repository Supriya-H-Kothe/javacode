package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass9_Absolute_xpath1_learninghtml
{
public static void main(String[] args) 
	{
       ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BusinessComputers.In/Desktop/learningHTML1%20-%20Copy.html");
		WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
			e1.sendKeys("supriya@gmail.com");
		e1.click();
		WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("form");
		WebElement e3=driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("1234");
		WebElement e4=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("supriya");
		WebElement e6=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e6.click();
		WebElement e7=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		e7.click();
		WebElement e9=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		e9.click();
		WebElement e10=driver.findElement(By.xpath("(/html/body/input)[4]"));
		e10.click();
		WebElement e11=driver.findElement(By.xpath("(/html/body/input)[5]"));
		e11.click();
		WebElement e12=driver.findElement(By.xpath("(/html/body/input)[6]"));
		e12.click();
	}
	

}
