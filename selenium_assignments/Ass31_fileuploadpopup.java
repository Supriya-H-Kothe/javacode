package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass31_fileuploadpopup 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration");
	WebElement fileupload=driver.findElement(By.name("file"));
	fileupload.sendKeys("C:\\Users\\BusinessComputers.In\\Desktop\\Core java topics\\Interface.pdf");
}
}
