package demoexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demoException2 {
	public static void main(String[] args) 
	{
		while(true)
		{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("enter the value:");
			int x= s.nextInt();
			int k=45/x;
			System.out.println("the val of k"+k);
			s.close();
		}
		catch(InputMismatchException  ae)
		{
			System.out.println("only non-zero");
		}
		catch(ArithmeticException  ae)
		{
			System.out.println("only non-zero");
		}
	     }
		}
}
