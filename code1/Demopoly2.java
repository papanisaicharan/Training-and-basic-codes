package demopoly;
class Subclass5
{
	void add(int ...x)
	{
		int sum=0;
		System.out.println("the ele:");
	for(int k:x)
	{
		System.out.println(k+" ");
		sum=sum+k;
	}
	System.out.println("sum="+sum);
	}
}
public class Demopoly2 {
	public static void main(String[] args) {
    Subclass5 pp=new Subclass5();
    pp.add(1,1,1);
    pp.add(1,1);
    pp.add(1,2,3);
	}

}
