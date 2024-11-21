package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import source.Homepage;
import source.login_page;

public class Testcase1 extends Launch_quit
{
	@Test
	public void logintoamazon() 
	{
	Homepage h1=new Homepage(driver);
   h1.acc_list(driver);
   h1.signin();
 login_page l1=new login_page(driver);
   l1.username();
  l1.login_continue();
  l1.pwd();
   l1.signintologin();
}
}
