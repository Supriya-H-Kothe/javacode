package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Iteration {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add(45);
		a1.add(10);
		a1.add(65);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
