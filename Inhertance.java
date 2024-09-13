package basics;

public class Inhertance
{
	void talent ()
	{
		System.out.println("singing");
	}
class Subclass1 extends Inhertance
{
void Skill()
	{
		System.out.println("Painting");
	}

	}
public static void main(String[]args)
{
	System.out.println("dancing");
	Subclass1 i1= new Subclass1 ();
	i1.Skill();
	i1.talent();
	}
}






