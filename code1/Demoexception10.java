package demoexception;
import java.util.*;
interface Transaction1{
	public void withdraw(int amt)throws Exception;
}
public class Demoexception10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try{
System.out.println("enter the valid amt");
	int amt=s.nextInt();
	Transaction1 jj=new Transaction1()
			{
				public void withdraw(int amt)
						throws Exception{
				try{
					if (amt>2222)
					{
						throw new Exception("insufficient fund");
					}
					else
					{
						System.out.println("amt="+amt);
					}
				}
				catch(Exception e)
				{
					throw e;
				}
				}
			};
			jj.withdraw(amt);
		}
		catch(Exception p)
		{
			System.out.println(p.getMessage());
		}
	s.close();
	}

}
