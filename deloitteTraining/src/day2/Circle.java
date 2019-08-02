package day2;

public class Circle extends Shape {
	
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
			System.out.println("Area of circle : " + Math.PI * radius*radius);
	}
}
