package assignments;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;

public class StackVector_Enumeration {

	public static void main(String[] args) 
	{
		Stack a1=new Stack();
		a1.add(12);
		a1.add(45);
		a1.add(10);
		a1.add(65);
		Enumeration e1=a1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		Stack a2=new Stack();
		a2.add(12);
		a2.add(45);
		a2.add(10);
		a2.add(65);
		Enumeration e2=a2.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}

}
