package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ass17_Dropdown_growtechminds1 {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/drag-and-drop/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("container"));
WebElement e2=driver.findElement(By.id("div2"));
Actions a1=new Actions(driver);
a1.dragAndDrop(e1, e2).perform();

}
}
