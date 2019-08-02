package com.deloitte.employee.applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

public class EmployeeUpdate {
	private static Scanner s;
	private static EmployeeDao dao;
	public static void main(String[] args) {
		dao = new EmployeeDaoImp();
		Employee emp = new Employee();
		s = new Scanner(System.in);
		System.out.println("enter the empcode,empname,job,salary,stdate(dd-mm-yyyy) which u want to update : ");
		int empcode = s.nextInt();
		String empname = s.next();
		String job = s.next();
		double salary = s.nextDouble();
		String stdate = s.next();
		SimpleDateFormat sdf = new SimpleDateFormat(stdate);
		Date dt = null;
		try {
			dt = sdf.parse(stdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		emp.setEmpcode(empcode);
		emp.setEmpname(empname);
		emp.setJob(job);
		emp.setSalary(salary);
		emp.setDatejoin(dt);
		int rows = dao.updateEmployee(emp);
		if(rows > 0) {
			System.out.println(rows+" rows updated");
		}else {
			System.out.println("updation failed");
		}
		

	}

}
