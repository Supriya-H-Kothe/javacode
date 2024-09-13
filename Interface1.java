package basics;// multiple level inheritance example with two interfaces having relation between them.
interface Google2 
{
	void login_auth();
	void logout_auth();
	}
	interface Amazone2 extends Google2
	{
		void login_auth_Amz1();
		void logout_auth_Amz1();
	}
	public class Interface1 implements Amazone2
	{
	public void login_auth()
		{
		}
		
	public void logout_auth()
		{
		}
	public void login_auth_Amz1()
	{
	}
	public void logout_auth_Amz1()
	{
	}

		public static void main (String[]args)
		{
			
			
		}
	}






