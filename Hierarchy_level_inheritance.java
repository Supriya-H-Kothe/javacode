package assignments;


class GrandParent 
{

void method1()
{
	System.out.println("1st method");
} 
}
class Parent extends GrandParent
{
static void method2()
{
	System.out.println("2nd method");
}
}
public class Hierarchy_level_inheritance extends Parent
{

void method3()
{
	System.out.println("3rd method");
}

public static void main(String[] args) 
	{
	Hierarchy_level_inheritance h1=new Hierarchy_level_inheritance();
h1.method1();
h1.method2();
h1.method3();
		
	}

}
