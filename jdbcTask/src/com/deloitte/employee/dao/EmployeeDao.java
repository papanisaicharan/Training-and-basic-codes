package com.deloitte.employee.dao;

import java.util.List;

import com.deloitte.employee.beans.Employee;

public interface EmployeeDao {
	void close();
	void openDbConnection();
	int addEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(int empcode);
	List<Employee> getEmployees();
	Employee getEmployee(int empcode);
}
