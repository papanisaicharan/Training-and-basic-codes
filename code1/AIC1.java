package anonymousinnerclasses;
class Test1
{
	void m(){
		System.out.println("superclass");
	}
}
public class AIC1 {
	public static void main(String[] args){
		Test1 obj=new Test1()
				{
			void m()
			{
				System.out.println("subclass");
			}
				};
				obj.m();
	}
}
