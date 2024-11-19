package selenium_assignments;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass37_Takescreenshot_unique {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot ts=driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);//screenshot is here
	File destination=new File("C:\\Users\\BusinessComputers.In\\Desktop\\selenium screenshot\\"+new Ass37_Takescreenshot_unique().getClass()+Math.random()+".png");//store screenshot
	//File destination=new File("C:\\Users\\BusinessComputers.In\\Desktop\\selenium screenshot\\"Date1+".png");
   FileHandler.copy(source,destination);
	}

}
