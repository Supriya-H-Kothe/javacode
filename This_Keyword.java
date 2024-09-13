package basics;

public class This_Keyword 
{
 int age;
 String name;
 long salary;
 public void StudentInfo(int age,String name,long salary)
 {
	 this.age=age;
	 System.out.println("d");
 }
 public static void main (String[]args)
 {
	 This_Keyword t1 =new This_Keyword();
	t1. StudentInfo(23,"Ram",23986);
	System.out.println(t1.age);
 }
 }
 


