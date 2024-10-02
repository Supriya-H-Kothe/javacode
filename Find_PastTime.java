package assignments;

import java.util.Date;

public class Find_PastTime {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		d1.getTime();
		Date d2=new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println(d2);
	}

}
