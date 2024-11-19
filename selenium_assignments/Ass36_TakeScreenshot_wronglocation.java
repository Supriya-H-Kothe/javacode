package selenium_assignments;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass36_TakeScreenshot_wronglocation {

	public static void main(String[] args) {

      ChromeDriver driver=new ChromeDriver();
      driver.get("http://www.google.com");
      driver.manage().window().maximize();
      TakesScreenshot ts=driver;
      File source =ts.getScreenshotAs(OutputType.FILE);
      File destination=new File("D:\\Users\\BusinessComputers.In\\Desktop\\selenium screenshot\\supriya.png");
		

	}

}
