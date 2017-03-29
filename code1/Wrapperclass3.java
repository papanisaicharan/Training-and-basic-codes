package wrapperclasses;

public class Wrapperclass3 {
	public static void main(String[] args) {
		Character obj1=new 	Character('p');
		
		System.out.println("display from boxing");
		System.out.println("obj1="+obj1);

		Character p=obj1.charValue();

		System.out.println("display from unboxing");
		System.out.println("obj1="+p);

	}
}
