package assignments;
class Getter_setter1
{
	private String un="supriya@gmail.com";
	public void setUn(String un)
	{  
		this.un=un;
		System.out.println("setter method");
	}
	public String GetUn()
	{
		return un;
	}
}


public class Encapsulation_concept 
{

	public static void main(String[] args)
	{
		Getter_setter1 g1=new Getter_setter1();
		g1.setUn("monika@gmail.com");
		System.out.println(g1.GetUn());


	}

}
