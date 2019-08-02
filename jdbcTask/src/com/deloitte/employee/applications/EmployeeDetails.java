package com.deloitte.employee.applications;

import java.util.Scanner;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

public class EmployeeDetails {

	private static Scanner s;
	private static EmployeeDao dao;
	public static void main(String[] args) {
		dao = new EmployeeDaoImp();
		s = new Scanner(System.in);
		System.out.println("enter the empcode: ");
		int empcode = s.nextInt();
		Employee emp = dao.getEmployee(empcode);
		System.out.println(emp);

	}

}
