package basics;

import java.util.Collection;
import java.util.PriorityQueue;

public class Queue_PriorityQueue_Behaviour {

	public static void main(String[] args)
	{
		PriorityQueue p1=new PriorityQueue();
		p1.add(123);
		p1.add(23);
		p1.add(124);
		p1.add(223);
		System.out.println(p1);
		//Collection.sort(p1);
		PriorityQueue p2=new PriorityQueue();
		p2.add(122);
		p2.add(233);
		p2.addAll(p2);
		
		
		
		

		
	}

}
