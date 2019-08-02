package com.deloitte.employee.applications;

import java.util.Scanner;

import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

public class EmployeeDelete {
	private static Scanner s;
	private static EmployeeDao dao;
	public static void main(String[] args) {
		dao = new EmployeeDaoImp();
		s = new Scanner(System.in);
		System.out.println("enter the empcode: ");
		int empcode = s.nextInt();
		int rows = dao.deleteEmployee(empcode);
		if(rows > 0) {
			System.out.println(rows + " row deleted.");
		}else {
			System.out.println("deletion failed");
		}
	}

}
