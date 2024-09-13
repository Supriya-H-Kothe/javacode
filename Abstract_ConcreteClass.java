package basics;
abstract class Facebook_auth
{
	abstract void login();
	abstract void name ();
	
}
abstract class Google_auth extends Facebook_auth
{
	abstract void logout();
	abstract void password ();
	
}

public class Abstract_ConcreteClass extends Google_auth
{
   void logout() 
	{
		
		
	}

	void password() {
		
		
	}

	void login() 
	{
		
		
	}

void name() {
		
	}

}
