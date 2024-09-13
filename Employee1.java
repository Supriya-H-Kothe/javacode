package basics;

public class Employee1
{
	 void Salary()
		{
			System.out.println("Salary");
			
		}
	}
		class Boss1 extends Employee1
		
		{
		
	  static void Bonus()
		{
			System.out.println("Bonus");
			{
	}
		}
	  
		}
		class Staff1 extends Boss1
		{
			public static void main(String[]args)
			{
				System.out.println(" Main method");
				Staff1 s1=new Staff1();
				s1.Salary();
				Bonus();
				
			}
		}
		
	

