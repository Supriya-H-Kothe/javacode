package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(34);
		a1.add(67);
		a1.add(54);
		a1.add(69);
		a1.add(69);
		a1.add(null);
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(44);
	a2.add(89);
	a1.addAll(a2);
	System.out.println(a1);
	ArrayList a3=new ArrayList();
	a3.add(44);
	a3.add(89);
	a3.add(22);
	a3.add(99);
	Collections.sort(a3);
	System.out.println(a3);
	Iterator i1=a3.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	ListIterator i2=a3.listIterator();
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	
		
		
		

	}

}
