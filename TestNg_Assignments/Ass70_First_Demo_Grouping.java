package TestNg_Assignments;

import org.testng.annotations.Test;

public class Ass70_First_Demo_Grouping 
{
	@Test(groups= {"integration"})
	public void method1()
	{
		
	}
	@Test(groups= {"integration"})
	public void method2()
	{
		
	}
	@Test(groups= {"system"})
	public void method3()
	{
		
	}

	@Test(groups= {"system","smoke"})
	public void method4()
	{
		
	}

	@Test(groups= {"system"})
	public void method5()
	{
		
	}



}
