package assignments;

public class This_keyword 
{
	String name;
	int age;
	void Student_details(String name,int age)
	{  
		this.name=name;
		System.out.println("students details" );
	}

	public static void main(String[] args) 
	{
		This_keyword t1=new This_keyword ();
		t1.Student_details("om", 29);
		System.out.println(t1.name);

	}

}
