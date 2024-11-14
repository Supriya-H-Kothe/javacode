package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass15_Amazonesearch_catogory {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
WebElement e1=driver.findElement(By.id("searchDropdownBox"));
Select s1=new Select(e1);
//s1.selectByIndex(9);
s1.selectByValue("search-alias=alexa-skills");
//s1.selectByVisibleText("Appliances");
	}

}
