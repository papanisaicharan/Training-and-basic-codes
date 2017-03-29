package demoexception;
import java.util.InputMismatchException;
import java.util.Scanner;
class Designation{
	boolean l;
	String p;
	Designation(String p)
	{
		this.p=p;
	}
	Designation()
	{
	
	}
	boolean check(String desg)
	{
		boolean k;
		switch( desg)
		{
		case "se":k=true;
		break;
		default:k=false;
		}
		return k;
	}
}
@SuppressWarnings("serial")
public class Demoexception6 extends Exception{
	Demoexception6(String str)
	{
	super(str);
	}
	
	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         try
         {
        	 System.out.println("enter the data");
        	 String desg=s.nextLine();
        	 Designation d1=new Designation();
        	 boolean k=d1.check(desg);
        	 if(!k)
        	 {
        		 throw new Demoexception6("invalid desg");
        	 }
        	 else
        	 {
        		 System.out.println("enter the bsal");
        		 int bsal=s.nextInt();
        		 if(bsal<5000)
        		 {
        			 throw new Demoexception6("invalid bsal");
        		 }
        		 else
        		 {
        			 System.out.println("bsal"+bsal);
        		 }
        	 }
         }
         catch(Demoexception6 obj)
         {
         	 System.out.println(obj.getMessage());
         }
         catch(InputMismatchException obj1)
         {
        	 System.out.println("invalid input");
         }
         finally
         {
        	 s.close();
         }
	}
}
