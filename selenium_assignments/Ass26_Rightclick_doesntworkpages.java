package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass26_Rightclick_doesntworkpages {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
e1.click();
WebElement e2=driver.findElement(By.name("userName"));
e2.sendKeys("supriya");
WebElement e3=driver.findElement(By.id("label2"));
e3.sendKeys("1234");
WebElement e4=driver.findElement(By.id("loginCaptchaValue"));
e4.sendKeys("ghty");


	}

}
