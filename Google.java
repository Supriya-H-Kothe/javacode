package basics;

 interface Amazone 
{
void login_auth();
void logout_auth();
}
interface Amazone3 extends Amazone
{
	void login_auth_Amz();
	void logout_auth_Amz();
}
public class Google implements Amazone3
{
public void login_auth()
	{
	}
	
public void logout_auth()
	{
	}
public void login_auth_Amz()
{
}
public void logout_auth_Amz()
{
}

	public static void main (String[]args)
	{
		
		
	}
}


