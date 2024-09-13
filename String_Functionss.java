package basics;// contains(Boolean),matches(),charAtIndex(),indexOfChar()

public class String_Functionss 
{
	public static void main (String[]args)
	{
		String s1="Weather update";
		Boolean sname=s1.contains("update");
		System.out.println(sname);
		String s2="Weather";//check if the given string ends with 'r'
		Boolean dname = s2.matches("(.*)r");// .* is multi-character search
		System.out.println(dname);
		String s3="climate";//check if the given string starting with 'r'
		Boolean cname = s3.matches("r(.*)");// .* is multi-character search
		System.out.println(cname);
		Boolean aname=s3.matches("(.*)m(.*)");// if in the given string m is present or not
		System.out.println(aname);
		Boolean wname=s3.matches("....");// if in the given string 4 exact letters present or not
		System.out.println(wname);
		
		String st ="Supriya";
		char c1=st.charAt(4);
		System.out.println(c1);
		
		String str="Kothe";
		int i1=str.indexOf('t');
		System.out.println(i1);
		
		
	

	}
}