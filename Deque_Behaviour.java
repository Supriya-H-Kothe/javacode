package assignments;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;

public class Deque_Behaviour
{

	public static void main(String[] args) 
	{
		Deque i1=new ArrayDeque();
		i1.add(45);
		i1.add(89);
		i1.add(98);
		i1.add(45);
		i1.add(true);
		//i1.add(null);
		System.out.println(i1);
		Deque d2=new ArrayDeque();
		d2.add(95);
		d2.add(69);
		d2.add(38);
		d2.add(15);
		//Collections.sort(i2);
		Iterator i2=d2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
			
		}
		/*ListIterator i3=d2.listIterator();
		while(i3.hasPrevious())
		{
			System.out.println(i3.previous());
			
		}*/
		
		
		
		
		
		
	}

}
