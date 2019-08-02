package com.deloitte.employee.variables;

public class EmployeeDequeries {
	public static final String INSERT = "insert into employee values(?,?,?,?,?)";
	public static final String SELECT = "select * from employee";
	public static final String SELECTWITHCODE = "select * from employee whare empcode =?";
	public static final String UPDATE = "update employee set empname = ?,job = ?,salary =?,datajoin=? where empcode = ?";
	public static final String DELETE = "delete from employee where empcode = ?";
}