package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass16_howerover_grotechmind_demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
WebElement e1=		driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
Actions a1=new Actions(driver);
a1.moveToElement(e1).perform();
Thread.sleep(1000);

WebElement e2=driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
e2.click();
	}

}
