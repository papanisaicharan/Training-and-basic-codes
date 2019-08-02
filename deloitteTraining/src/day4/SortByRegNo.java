package day4;
import java.util.*;

import day2.Student;


public class SortByRegNo implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getRegno() - arg1.getRegno();
	}
}
