package assignments;

import java.util.InputMismatchException;

public class Throw_Throws {

	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if(1==1)
		{
			throw new NullPointerException("Sorry your cell is empty");
		}
		else
		{
			throw new InputMismatchException("Sorry Check your input before enter");
		}
	}

}
