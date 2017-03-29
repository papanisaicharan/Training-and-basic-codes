package demoexception;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class Pinno extends Exception
{
	
	Pinno(){};
	Pinno(String str)
	{
		super(str);
	}
	void check(int pin) throws Pinno
	{
		try{
		switch(pin)
		{
		case 1111:
			break;
			default:
				throw new Pinno("invalid pinno");
		}
		}
		catch(Pinno obj)
		{
		throw obj;
		}
	}
}
@SuppressWarnings("serial")
class Transaction extends Exception
{
	Transaction(){};
	Transaction(String str)
	{
		super(str);
	}
	void withdraw(int amt)throws Transaction
	{
		try{
			if(amt>2000)
			{
				throw new Transaction("invalid amt");
			}
			else
			{
				System.out.println("amt withdrawn is:"+amt+"transaction is done");
			}
		}
		catch(Transaction obj)
		{
			throw obj;
		}
	}
}
public class Demoexception8 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try{
		System.out.println("enter the pinno");
		int p2=s.nextInt();
		Pinno p=new Pinno();
		p.check(p2);
		System.out.println("enter the amt");
		int amt=s.nextInt();
		Transaction t2=new Transaction();
		t2.withdraw(amt);
	}
	catch(Pinno |Transaction m)
	{
		System.out.println(m.getMessage());
	}
	catch(InputMismatchException  m)
	{
		System.out.println("only integer val");
	}
	s.close();
	}

}
