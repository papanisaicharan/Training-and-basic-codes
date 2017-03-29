package wrapperclasses;

public class Wrapperclass5 {
	public static void main(String[] args) {
System.out.println("boxing process");
Integer obj=Integer.valueOf(123);
Integer obj1=Integer.valueOf("123");
Float obj2=Float.valueOf(12f);
Float obj3=Float.valueOf("12.1");
Character obj4=Character.valueOf('g');
Boolean obj5=Boolean.valueOf(true);
Boolean obj6=Boolean.valueOf("nit.v");
System.out.println("unboxing process");
System.out.println("obj="+obj);
System.out.println("obj1="+obj1);
System.out.println("obj2="+obj2);
System.out.println("obj3="+obj3);
System.out.println("obj4="+obj4);
System.out.println("obj5="+obj5);
System.out.println("obj6="+obj6);
	}
}
