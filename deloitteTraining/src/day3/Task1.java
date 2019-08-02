package day3;

public class Task1 implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 t = new Task1();
		t.method1();
		t.method2();
		t.testone();
		Interface1.staticmethod();
		Interface2.staticmethod();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	@Override
	public void testone() {
		// TODO Auto-generated method stub
		System.out.println("in task1");
	}
	
	void staticmethod() {
		System.out.println("staticinterface1");
	}

}
