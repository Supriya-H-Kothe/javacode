package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Iterrate_throughmapelements 
{

	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap <Integer,String>();
		m1.put(1, "Supriya");
		m1.put(2, "Ankita");
		m1.put(3, "Priya");
		m1.put(4, "Nikita");
		System.out.println(m1);
		for(Integer s1:m1.keySet())
		{
			System.out.println("using keyset"+s1);
	     }
		for (String s2:m1.values())
		{
			System.out.println("using values"+s2);
			
		}
		for(Entry<Integer, String> s3:m1.entrySet())
		{
			System.out.println("Using entryset"+s3);
		}
		

	}
	

}
