package anonymousinnerclasses;

class Test11{
	int a=20;
	void m()
	{
		System.out.print("superclass");
	}
}
public class AIC11 {
public static void main(String[] args)
{
	Test11 obj=new Test11()
			{
		{
			System.out.println("non static block");
		}
		void m()
		{
			System.out.println("subclass");
			System.out.println("val of:"+a);
			dis2();
		}
		void dis2()
		{
			System.out.println("Dis");
		}
			};
			obj.m();
			System.out.println("hash code of the obj:"+obj.hashCode());
			
}
}
