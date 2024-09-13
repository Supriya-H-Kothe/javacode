package basics;

public class Final_Method 
{
final static void login()
{

	System.out.println("login method");
}
}
class Amazone11 extends Final_Method
{
	static void logout()
	{
		System.out.println("logout method");
	}
	public static void main(String[] args) 
	{
		Final_Method f1= new Final_Method();
		f1.login();
	}
}
	


