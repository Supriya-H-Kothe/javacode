package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_properties {

	public static void main(String[] args)
	{
		List l1= new ArrayList();
		l1.add(67);
		l1.add(89);
		l1.add(12);
		l1.add(24);
		l1.add(null);
		l1.add(67);
		l1.add("supriya");
		System.out.println(l1);
		List l2= new ArrayList();
		l2.add(22);
		l2.add(42);
		l2.add(12);
		l2.add(2);
		l1.addAll(l2);
		System.out.println(l1);
		Collections.sort(l2);
System.out.println(l2);
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
