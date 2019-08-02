package day3;

public interface Interface1 {
	public void method1();
	default void testone() {
		System.out.println("interface1");
	}
	//if two same default methods are present in two interfaces 
	static void staticmethod() {
		System.out.println("staticinterface1");
	}
}
