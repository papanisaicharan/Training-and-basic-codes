package demopoly;
class Subclass
{
void add(int a,double d)
{
	System.out.println("sum="+(a+d));
}
void add(int a,float b)
{
	System.out.println("sum="+(a+b));
}
void add(int a,int b,int c)
{
	System.out.println("sum="+(a+b+c));
}
}
public class Demopoly1 {
	public static void main(String[] args) {
		Subclass obj=new Subclass();
		obj.add(1, 2);
		obj.add(1, 2.24);
		obj.add(1, 2,3);
	}
}
