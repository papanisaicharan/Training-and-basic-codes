package day3;

import java.util.Scanner;

import day2.Student;

public class AccountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(x);
		Student[] students = new Student[3];
		students[0] = new Student(123,"sai","12");
		students[1] = new Student(124,"sai","12");
		students[2] = new Student(123,"sai","12");
		for( Student i : students) {
			i.display();
		}
	}

}
