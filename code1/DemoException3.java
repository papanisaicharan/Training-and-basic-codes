package demoexception;

import java.util.*;
//import java.lang.*;
class DemoException3
{
	public static void main(String[] args) 
	{
		
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("enter the value:");
			int x= s.nextInt();
			int k=45/x;
			System.out.println("the val of k"+k);
			s.close();
		}
		catch(InputMismatchException |ArithmeticException  ae)
		{
			System.out.println("only non-zero");
		};
	
	}
}

