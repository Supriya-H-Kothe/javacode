package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_ListOfiterator {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add(45);
		a1.add(10);
		a1.add(65);
		ListIterator i1=a1.listIterator();
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}

	}

}
