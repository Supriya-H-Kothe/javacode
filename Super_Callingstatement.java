package assignments;

class Subchild
{
	Subchild()
	{   
		System.out.println("superclass constructor");
	}
}
public class Super_Callingstatement extends Subchild
	{
		Super_Callingstatement(int a)
		{    super();
			System.out.println("subclass constructor");
		}
	public static void main(String[] args) 
	{
		new Super_Callingstatement(12);
		
		
	}

}
