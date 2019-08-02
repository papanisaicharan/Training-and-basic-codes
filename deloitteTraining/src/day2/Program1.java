package day2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Shape sp;
		System.out.println("enter 1 for circle and 2 for rectangle");
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			System.out.print("enter radius : ");
			sp = new Circle(s.nextInt());
			sp.area();
			break;
		case 2:
			System.out.print("enter length :");
			int p = s.nextInt();
			System.out.print("enter breadth :");
			int b = s.nextInt();
			sp = new Rectangle(p,b);
			sp.area();
			break;
		default:
			System.out.println("wrong choice bro..!");
			
		}
	}

}
