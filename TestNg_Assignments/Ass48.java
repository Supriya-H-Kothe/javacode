package TestNg_Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass48 
{
	@BeforeMethod
	public void test1()
	{
	System.out.println("BeforeMethod");
	}
	@Test
	public void test2()
	{
	System.out.println("Test");
	}
@AfterMethod
	public void test3()
	{
	System.out.println("AfterMethod");
	}

}
