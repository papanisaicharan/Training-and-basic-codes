package demostring;

import java.util.Scanner;

public class Demostring2 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=s.nextLine();
	s1=s1.trim();
	System.out.println("enter the string2");
	String s2=s.nextLine();
	s2=s2.trim();
	System.out.println("----equals()------");
	boolean k=s1.equalsIgnoreCase(s2);
	if(k)
	{
		System.out.println("strings are equals");
	}
	else
	{
		System.out.println("strings are not equals");
	}
	System.out.println("-----compare()------");
	int z=s1.compareToIgnoreCase(s2);
	if(z==0)
	{
		System.out.println("strings are equal");
	}
	else
	{
		System.out.println("strings are not equal");
	}
s.close();
	}
}
