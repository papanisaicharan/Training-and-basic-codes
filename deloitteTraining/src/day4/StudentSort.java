package day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import day2.Student;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> t = new TreeSet<>();
		t.add(new Student(45,"paa","g"));
		t.add(new Student(23,"app","c"));
		for(Student s : t) {
			System.out.println(s.getRegno()+" "+s.getStdname());
		}
		ArrayList<Student> t1 = new ArrayList<>();
		t1.add(new Student(45,"paa","g"));
		t1.add(new Student(23,"app","c"));
		Collections.sort(t1);
		for(Student s : t1) {
			System.out.println(s.getRegno()+" "+s.getStdname());
		}
		Collections.sort(t1,new SortByRegNo());
		for(Student s : t1) {
			System.out.println(s.getRegno()+" "+s.getStdname());
		}
	}

}
