package demoexception;
import java.util.*;
class Table{
	void print(int n) throws InterruptedException{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			Thread.sleep(1000);
		}
	}
}
public class Demoexception4 {
		//InterruptedException,CloneNotSupportedException,MalformedException
		public static void main(String[] args)  throws InterruptedException 
		{	
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter the value of n:");
				int n=scanner.nextInt();
				Table obj=new Table();
				obj.print(n);
				scanner.close();
		}
}
