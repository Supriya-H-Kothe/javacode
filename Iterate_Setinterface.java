package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate_Setinterface {

	public static void main(String[] args)
	{
		Set s1=new HashSet();
		s1.add(77);
		s1.add(98);
		s1.add(23);
		s1.add(18);
		System.out.println(s1);
		Iterator i1=s1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		

	}

}
