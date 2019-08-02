package day2;

public class Usingstatic {
	static int x = 10;
	static void display() {
		x++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		x++;
		display();
	}

}
