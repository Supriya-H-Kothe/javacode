package assignments;

import java.util.Date;

public class FInd_Date 
{
public static void main(String[] args)
{
	Date d1=new Date();
	d1.getTime();
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
}
	
	
}
