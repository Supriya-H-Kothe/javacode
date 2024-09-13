package basics;

public class Array_basics 
{
	public static void main(String[] args) 
	{
     int rollno[]=new int[4]; //declaration of array
	rollno[0]=23;
	rollno[1]=33;
	rollno[2]=43;
	rollno[3]=53;
	rollno[4]=63;
	String name[]=new String[4];
	name[0]="pallavi";
	name[1]="Veena";
	name[2]="Reena";
	name[3]="Heena";
	for(int i=0;i<4;i++)
	{
	System.out.println(rollno[i]+name[i]);
	}
}
}


