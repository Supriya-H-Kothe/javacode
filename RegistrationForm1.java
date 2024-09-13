package basics;

import java.util.Scanner;

public class RegistrationForm1 
{
public static void main (String[]args)
{
	Scanner rf1=new Scanner(System.in);
	System.out.println("Enter the FirstName");
	String FirstName= rf1.next();
	System.out.println("FirstName:"+FirstName);
	System.out.println("Enter the LastName");
	String LastName= rf1.next();
	System.out.println("LastName:"+LastName);
	System.out.println("Enter the Gender1");
	String Gender1= rf1.next();
	System.out.println("Gender1:"+Gender1);
	System.out.println("Enter the Gender2");
	String Gender2= rf1.next();
	System.out.println("Gender2:"+Gender2);
	System.out.println("Enter the PresentAddress:");
	String PresentAddress=rf1.next();
	System.out.println("PresentAddress:"+PresentAddress);
	System.out.println("Enter the ParmanentAddress:");
	String ParmanentAddress=rf1.next();
	System.out.println("PresentAddress:"+ParmanentAddress);
	System.out.println("Enter the Pincode:");
	Long Pincode=rf1.nextLong();
	System.out.println("Pincode:"+Pincode);
	
}

}
