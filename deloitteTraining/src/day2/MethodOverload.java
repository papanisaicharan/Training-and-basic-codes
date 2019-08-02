package day2;

public class MethodOverload {
	
	void add(int x,int y) {
		System.out.println("int " + (x+y));
	}
	void add(double x,double y) {
		System.out.println("int " + (x+y));
	}
	void add(String x,String y) {
		System.out.println("int " + (x+y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload s = new MethodOverload();
		s.add(11.1, 2.2);
		s.add(11, 2);
	}

}
