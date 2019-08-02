package day3;

public interface Interface2 {
	public void method1();
	public void method2();
	default void testone() {
		System.out.println("interface2");
	}
	static void staticmethod() {
		System.out.println("staticinterface2");
	}
}