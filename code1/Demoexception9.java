package demoexception;

import java.util.*;
interface Test1
{
	public void calculate(int x)throws Display;
}
class Arthimetic extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Arthimetic()
	{
	}
	Arthimetic(String str)
	{
		super(str);
	}
	 void m(int y) throws Display{
	}
}
class Display extends Arthimetic implements Test1
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Display()
	{
		
	}
	Display(String str)
	{
		super(str);
	}
	public void calculate(int x) throws Display
	{
		try{
			if(x==0)
			{
				throw new Display("only non-zero");
			}
			else
			{
				System.out.println("sqrt="+Math.sqrt(x));
			}
		}
		catch(Display e)
		{
			throw e;
		}
	}
	void m(int y) throws Display
	{
		try{
			if(y==0)
			{
				throw new Display();
			}
			else
			{
				System.out.println("cube="+Math.pow(y, 3));
			}
		}
		catch(Display l)
		{
			throw l;
		}
	}
}
public class Demoexception9 {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
try{
	Display d2=new Display();
	System.out.println("enter the value");
	d2.calculate(s.nextInt());
	System.out.println("enter the value of y");
	d2.m(s.nextInt());
}
catch(Display dd)
{
	System.out.println(dd.getMessage());
}
catch(InputMismatchException e)
{
	System.out.println("only integer value");
}
s.close();
	}
}
