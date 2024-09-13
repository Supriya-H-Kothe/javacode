package basics;//string repeat /string split

import java.util.Arrays;

public class String_Repeat_Split 
{
	public static void main(String[] args) 
	{
		String s1="supriya";
		String r1=s1.repeat(5);
		System.out.println(r1);
		String[] r2=s1.split("");
		System.out.println(Arrays.toString(r2));
		String st="core java and selenium";
		String[] st1=st.split("",5);
		System.out.println(Arrays.toString(st1));
		
		
				
	

}
}
