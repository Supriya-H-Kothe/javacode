package basics;

public class Array_Check
{
	public static void main(String[] args) 
	{
		int notocheck=34;
		int rollno[]=new int[5];
		rollno[0]=23;
		rollno[1]=33;
		rollno[2]=43;
		rollno[3]=53;
		rollno[4]=34;
		for(int i=0;i<5;i++)
		{
		if (notocheck ==rollno[i])
		{
			System.out.println("the given no-->"+notocheck+ "is present");
			System.out.println("the given no-->"+notocheck+ "and its indexis"+i);
			
		}
		
		}
		}
	}


