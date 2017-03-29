package anonymousinnerclasses;
interface Test
{
	public void m();
}
class Display
{
	void dis(Test x)
	{
		x.m();
	}
}
public class AIC2 {
	public static void main(String [] args)
	{
       Display s=new Display();
       s.dis(new Test()
    		   {
    		   public void m()
    		   {
    			   System.out.println("dis from AIC");
    		   }
    		   } );
	}
	}
