package assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Set_Behaviour 
{

	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add(56);
		s1.add(98);
		s1.add(26);
		s1.add(10);
		s1.add(null);
		s1.add(26);
	System.out.println(s1);
	Set s2=new HashSet();
	s2.add(56);
	s2.add(98);
	s2.add(26);
	s2.add(18);
	s1.addAll(s2);
	System.out.println(s1);
	//Collections.sort(s2);
	Iterator i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	//ListIterator i1=s1.listIterator();
/*	while(i1.hasPrevious())
	{
		System.out.println(i1.previous());
	}*/
	
		
	}

}
