package anonymousinnerclasses;

interface Transaction
{
	public void Withdraw(int amt);
}
public class AIC111 {
	public static void main(String[] args)
	{
		Transaction obj= new Transaction()
		{
	public void Withdraw(int amt)
	{
		System.out.println("amt Withdraw"+amt);
		System.out.println("Transaction completed");
	}
	    };
	    obj.Withdraw(12000);
		System.out.println("Hashcode of obj:"+obj.hashCode());
	}
}
