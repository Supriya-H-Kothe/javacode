package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass19_Dropdown_grotechmindsregistration 
{
	public static void main(String[] args) throws InterruptedException {
		
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/registration/");
Thread.sleep(1000);
WebElement e1=driver.findElement(By.name("Skills"));
Select s1=new Select(e1);
s1.selectByIndex(0);
WebElement e2=driver.findElement(By.name("Country"));
Select s2=new Select(e2);
s1.selectByValue("India");
WebElement e3=driver.findElement(By.name("Relegion"));
Select s3=new Select(e3);
s1.selectByVisibleText("Hindu");
}
}
