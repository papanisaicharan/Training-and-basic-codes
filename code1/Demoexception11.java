package demoexception;
import java.util.*;
interface Transaction11{
	public void withdraw(int amt)throws Exception;
}
public class Demoexception11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try{
System.out.println("enter the valid amt");
	int amt=s.nextInt();
	@SuppressWarnings("resource")
	Transaction11 jj=(int x)->
			{
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
