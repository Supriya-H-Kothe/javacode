package TestNg_Assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ass47 {

	
		@Test
		public void test1()
		{
			System.out.println("test");
		}
		@AfterMethod
		public void test2()
		{
			System.out.println("AfterMethod");
		}
		@BeforeSuite
		public void test3()
		{
			System.out.println("BeforeSuite");
		}
		@AfterClass
		public void test4()
		{
			System.out.println("Afterclass");
		}



	}


