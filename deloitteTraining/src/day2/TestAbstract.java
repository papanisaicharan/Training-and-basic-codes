package day2;

public abstract class TestAbstract {
	protected int x;
	public TestAbstract() {
		x = 500;
	}
	void output() {
		System.out.println("abstract class");
	}
	abstract void display();
}
