package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Upcasting
{
	public static void main(String[] args)
	{
		
	
	List l1=new ArrayList();
	l1.add(12);
	l1.add(34);
	l1.add(42);
	l1.add("Supriya");
	l1.add(null);
	l1.add(null);
	System.out.println(l1);
	List l2=new ArrayList();
	l2.add(12);
	l2.add(34);
	l1.addAll(l2);
	List l3=new ArrayList();
	l3.add(123);
	l3.add(456);
	l3.add(789);
	Collections.sort(l3);
	Iterator i1=l1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	ListIterator i2=l1.listIterator();
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	
	


}
}
