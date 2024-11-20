package TestNg_Assignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass54Register_fiveinputs_tenpeople 
{
	@Test(dataProvider="register")
	public void Method1(String Fname,String Lname,String Gender,String DOB,String Emailid)
	{
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Gender);
		System.out.println(DOB);
		System.out.println(Emailid);
	}
	@DataProvider(name="register")
	public Object[][] Method2() 
	{
		Object Data[][]=new Object[10][5];
		Data[0][0]="supriya";
		Data[0][1]="kothe";
		Data[0][2]="female";
		Data[0][3]="2/7/1991";
		Data[0][4]="supriyafule@gmail.com";
		Data[1][0]="priya";
		Data[1][1]="kale";
		Data[1][2]="female";
		Data[1][3]="3/7/1991";
		Data[1][4]="priya@gmail.com";
		Data[2][0]="riya";
		Data[2][1]="kate";
		Data[2][2]="female";
		Data[2][3]="7/7/1991";
		Data[2][4]="riya@gmail.com";
		Data[3][0]="siya";
		Data[3][1]="kamde";
		Data[3][2]="female";
		Data[3][3]="8/7/1991";
		Data[3][4]="siya@gmail.com";
		Data[4][0]="diya";
		Data[4][1]="kamle";
		Data[4][2]="female";
		Data[4][3]="3/7/1991";
		Data[4][4]="diya@gmail.com";
		Data[5][0]="priya";
		Data[5][1]="kale";
		Data[5][2]="female";
		Data[5][3]="3/7/1991";
		Data[5][4]="priya@gmail.com";
		Data[6][0]="priyanka";
		Data[6][1]="kapale";
		Data[6][2]="female";
		Data[6][3]="9/7/1991";
		Data[6][4]="priyanka@gmail.com";
		Data[7][0]="diyanka";
		Data[7][1]="solaw";
		Data[7][2]="female";
		Data[7][3]="10/7/1991";
		Data[7][4]="divyanka@gmail.com";
		Data[8][0]="harsh";
		Data[8][1]="kothe";
		Data[8][2]="male";
		Data[8][3]="15/7/1991";
		Data[8][4]="Harsh@gmail.com";
		Data[9][0]="divya";
		Data[9][1]="fule";
		Data[9][2]="female";
		Data[9][3]="21/7/1991";
		Data[9][4]="divya@gmail.com";
		return Data;
	}

}
