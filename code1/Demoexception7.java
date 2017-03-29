package demoexception;
import java.util.*;
@SuppressWarnings("serial")
class Subclass extends Exception
{
	Subclass(){};
	Subclass(String str)
	{
		super(str);
	}
	void check(int age)
	{
		try{
			if(age<0)
			{
				throw new Subclass("invalid age");
			}
			else
			{
				System.out.println("age:"+age);
			}
		}
		catch(Subclass obj)
		{
			System.out.println(obj.getMessage());
		}
	}
}
public class Demoexception7 {
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
try{
	System.out.println("enter the age");
	int age=s.nextInt();
	Subclass obj2=new Subclass();
	obj2.check(age);
}
catch(InputMismatchException m)
	{
	System.out.println("only integer value");
	}
s.close();
	}
}
