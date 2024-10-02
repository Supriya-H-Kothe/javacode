package assignments;

public class No_ispresent_inarray {

	public static void main(String[] args) 
	{
		int notocheck=34;
int number[]=new int[5];
number[0]=12;
number[1]=22;
number[2]=34;
number[3]=72;
number[4]=92;
for(int i=0;i<5;i++)
{
	if (notocheck==number[i])
	{
		System.out.println("The given no is present");
		System.out.println("the index of"+notocheck+"is"+i);
	}
}






	}

}
