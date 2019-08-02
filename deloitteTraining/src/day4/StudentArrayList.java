package day4;

import java.util.ArrayList;
import day2.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(12,"sai","c"));
		students.add(new Student(12,"sai","c"));
		for(Student s: students) {
			s.display();
		}
	}

}
