package basics;//equals ,equalsIgnorecase,replace,replaceAll,concat,

public class String_Functions1 
{
	public static void main(String[]args)
	{
	String s1="Supriya";
	String s2="Suriya";
	Boolean s= s1.equals(s2);
	System.out.println(s);
	String s3="Supriya";
	Boolean a=s1.equalsIgnoreCase(s3);
	System.out.println(a);
	String s4="Supriya";
	String s5="Kothe";
	String con=s4.concat(" ").concat("Kothe").concat(" ").concat("fule");
	System.out.println(con);
	String g1="Supriya Fule";
	String gname=g1.replace("Fule","Kothe");
	System.out.println(gname);
	String e1="Elephant";
	String aname=e1.replace('E', 'a');
	System.out.println(aname);
	String r1="Techonology in 2030";
	String rname=r1.replaceAll("[a-z]", "");
	System.out.println(rname);
	String dname=r1.replaceAll("[0-9]", "");
	System.out.println(dname);
	String sname=r1.replaceAll(" ", "");
	System.out.println(sname);
	

}
}