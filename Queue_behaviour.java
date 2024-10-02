package assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_behaviour {

	public static void main(String[] args) 
	{
		Queue q1=new PriorityQueue();
		q1.add(56);
		q1.add(78);
		q1.add(96);
		q1.add(18);
		//q1.add(false);
		//q1.add(null);
		System.out.println(q1);
		Queue q2=new PriorityQueue();
		q2.add(76);
		q2.add(78);
		System.out.println(q1);
		//Collections.sort(q1);
		Iterator i1=q1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		/*ListIterator i2=q1.listIterator();
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
			
		}*/
		
		
		
	}

}
