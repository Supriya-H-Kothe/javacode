package assignments;

public class String_buildermethods 
{

	public static void main(String[] args)
	{
		StringBuilder s1=new StringBuilder ("Supriya");
		StringBuilder s2=s1.append("kothe");
		System.out.println(s2);
		System.out.println(s2.insert(7, "Harshal"));
		System.out.println(s2.replace(0,7, " "));
		System.out.println(s1.delete(0, 3));
		System.out.println(s1.capacity());
		System.out.println(s1.reverse());
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(2, 5));
		
	}

}
