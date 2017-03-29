package demostring;
import java.util.*;
public class DemoString5 {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int count=0;
System.out.println("count="+str.charAt(1));
	for(int i=0;i<str.length();i++)
	{
		switch(str.charAt(i))
		{
		case 'a'|'A'|'e'|'E'|'i'|'I'|'o'|'O'|'u'|'U':
   		count++;
		break;
		}
	}
	System.out.println("count="+count);
	s.close();
	}
}
