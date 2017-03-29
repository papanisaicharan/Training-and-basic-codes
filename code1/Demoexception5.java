package demoexception;

//import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Demoexception5 extends Exception{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

	try
	{
		System.out.println("enter the data");
		int b=s.nextInt();
		if(b<500)
		{
			throw new Demoexception5();
		}
		else
		{
			System.out.println("data"+b);
		}
	}
	catch(Demoexception5 e)
	{
		System.out.println("invalid amount");
	}
	finally
	{
		s.close();
	}
	}
}
