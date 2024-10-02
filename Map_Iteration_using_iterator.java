package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Iteration_using_iterator {

	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(12, "om");
		m1.put(34, "sai");
		m1.put(12, "niraw");
		m1.put(34, "sanvi");
		System.out.println(m1);
		Set<Entry<Integer,String>> e1=m1.entrySet();
		Iterator <Entry<Integer,String>> i1=e1.iterator();
		while(i1.hasNext())
		{
			System.out.println( i1.next());
		}
		

	}

}
