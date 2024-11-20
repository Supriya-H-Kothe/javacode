package TestNg_Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ass46 
{
	@BeforeTest
	public void test1()
	{
		System.out.println("test");
	}
	@BeforeClass
	public void test2()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void test3()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test4()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void test5()
	{
		System.out.println("test");
	}
	

}
