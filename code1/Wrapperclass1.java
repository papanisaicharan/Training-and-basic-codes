package wrapperclasses;

public class Wrapperclass1 {
	public static void main(String[] args) {
Integer obj1=new Integer(123);
Integer obj2=new Integer("123");
System.out.println("display from boxing");
System.out.println("obj1="+obj1);
System.out.println("obj2="+obj2);
String str=obj2.toString();
int k=obj1.intValue();
System.out.println("display from unboxing");
System.out.println("obj1="+k);
System.out.println("obj2="+str);
}
}
