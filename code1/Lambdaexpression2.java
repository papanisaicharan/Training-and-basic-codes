package anonymousinnerclasses;
interface Transaction11//functional interface 
{
	public void Withdraw(int amt);
}
interface Transaction22//functional interface 
{
	public void Withdraw(int amt);
}
public class Lambdaexpression2 {
	public static void main(String[] args) {
		Transaction11 obj= (int amt)->
	    {
		System.out.println("amt Withdraw"+amt);
		System.out.println("Transaction completed");
	    };
	    Transaction22 obj1= (int amt)->
	    {
		System.out.println("amt Withdraw"+amt);
		System.out.println("Transaction completed");
	    };
	    obj.Withdraw(12000);
	    obj1.Withdraw(42000);
		System.out.println("Hashcode of obj:"+obj.hashCode());
		System.out.println("Hashcode of obj:"+obj1.hashCode());
	}

}
