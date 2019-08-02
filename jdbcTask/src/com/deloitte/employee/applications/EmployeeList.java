package com.deloitte.employee.applications;

import java.util.List;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

public class EmployeeList {
	private static EmployeeDao dao;
	public static void main(String[] args) {
		dao = new EmployeeDaoImp();
		List<Employee> list = dao.getEmployees();
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}

}
