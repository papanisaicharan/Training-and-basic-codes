package demostring;
import java.util.*;
public class DemoString1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.nextLine();
		String s2="java";//literal method
		String s3=new String("programmer");
		char ch[]={'a','s','d','g'};
		String s4=String.valueOf(ch);
		String s5=s2.concat(s4);
		String s6=s1+s2+s3+s4;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
		System.out.println("s5="+s5);
		System.out.println("s6="+s6);
		System.out.println("length of s6="+s6.length());
		System.out.println("substring="+s6.substring(5,12));
		System.out.println("replace="+s6.replace('a','z'));
		System.out.println("upperclass="+s6.toUpperCase());
		s.close();
	}
}
