package demoexception;
import java.util.*;
interface Transaction12{
	static void m1(int x)throws Exception
	{
		try{
			if (x==0)
			{
			throw new Exception("only non-zero value")	;
			}
			else
			{
				System.out.println("val of x"+x);
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	default void m2(int x)throws Exception
	{
	try{
		if (x==0)
		{
		throw new Exception("only non-zero value")	;
		}
		else
		{
			System.out.println("val of x"+x);
		}
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}

public class Demoexception12 implements Transaction12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("enter the data");
			Transaction12.m1(s.nextInt());
			 Demoexception12  d2=new Demoexception12 ();
			 System.out.println("enter the val of y");
	         d2.m2(s.nextInt());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	s.close();
	}

}
