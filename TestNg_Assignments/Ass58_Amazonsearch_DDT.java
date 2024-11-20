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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass58_Amazonsearch_DDT 
{
	@Test
	public void search() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\BusinessComputers.In\\eclipse-workspace\\SeleniumBasics\\Data_insheet\\myexcelsheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("search");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		String product=c1.getStringCellValue();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(product);
		e1.sendKeys(Keys.ENTER);
	}

}
