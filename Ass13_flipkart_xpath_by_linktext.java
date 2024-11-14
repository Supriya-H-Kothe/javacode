package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass13_flipkart_xpath_by_linktext {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
e1.click();
	}

}
