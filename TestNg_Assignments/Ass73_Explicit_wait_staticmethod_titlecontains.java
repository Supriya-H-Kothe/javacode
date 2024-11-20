package TestNg_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ass73_Explicit_wait_staticmethod_titlecontains {
@Test
public void method1()
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
w1.until(ExpectedConditions.titleContains("Goo"));
    driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}



	}


