package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import source.Homepage;
import source.Search_resultpage;
import source.login_page;

public class Testcase4 extends Launch_quit
{
	@Test
	public void logout() throws InterruptedException 
	{
	Homepage h1=new Homepage(driver);
	   h1.acc_list(driver);
	   h1.signin();
	login_page l1=new login_page(driver);
	   l1.username();
	  l1.login_continue();
	  l1.pwd();
	  l1.signintologin();
	  h1.searching();
	  //h1.signoutpage();
	  Search_resultpage s1=new Search_resultpage(driver);
	  s1.selectshoe();
	  Set<String>s=driver.getWindowHandles();
		Iterator<String> i1= s.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
	  s1.addtowishlist();
	  Thread.sleep(2000);
	  s1.continue_shoping();
	  s1.add_cart();
	  Thread.sleep(2000);
	  driver.switchTo().window(parentid);
	  h1.acc_list(driver);
	  h1.signoutpage();
}
}
