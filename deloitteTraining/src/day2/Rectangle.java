package day2;

public class Rectangle extends Shape {
	//p is length,b is breadth
	private int p,b;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int k = (this.p*this.b);
//		System.out.println(p+" "+b);
		System.out.println("Area of rectangle is : " + k );
	}
	public Rectangle(int p, int b) {
		this.p = p;
		this.b = b;
	}

}
