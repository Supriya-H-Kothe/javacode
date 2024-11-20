package TestNg_Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass57_Amazon_login 
{
	@Test
	public void search() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\BusinessComputers.In\\eclipse-workspace\\SeleniumBasics\\Data_insheet\\myexcelsheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("login");
	Row r1=	s1.getRow(1);
Cell c1=	r1.getCell(0);
String username=c1.getStringCellValue();
Row r2=	s1.getRow(1);
Cell c2=	r1.getCell(1);
String password=c1.getStringCellValue();

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement e2=driver.findElement(By.id("email"));
		e2.sendKeys(username);
		WebElement e1=driver.findElement(By.id("pass"));
		e1.sendKeys(password);
		WebElement e3=driver.findElement(By.name("login"));
		e3.click();
		
		
		
	}

}
