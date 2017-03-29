//---------------------------------------------------------------------------------------------
package wrapperclasses;

public class Wrapperclass2 {
	public static void main(String[] args) {
		System.out.println("display from boxing");
		Float obj1=new Float(12.3f);
		Float obj2=new Float(12.3e3);
		Float obj3=new Float("12.3");
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		System.out.println("obj3="+obj3);
		System.out.println("display from unboxing");
	Float k=obj1.floatValue();
	Double b=obj2.doubleValue();
	String str=obj3.toString();
	System.out.println("obj1="+k);
	System.out.println("obj2="+b);
	System.out.println("obj3="+str);
	}

}
