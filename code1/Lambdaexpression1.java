package anonymousinnerclasses;
interface Transaction1
{
	public void Withdraw(int amt);
}
public class  Lambdaexpression1 {

	public static void main(String[] args) {
		Transaction1 obj= (int amt)->
	    {
		System.out.println("amt Withdraw"+amt);
		System.out.println("Transaction completed");
	    };
	    obj.Withdraw(12000);
		System.out.println("Hashcode of obj:"+obj.hashCode());

	}

}
