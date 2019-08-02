package com.deloitte.employee.dao.impl;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.variables.EmployeeDequeries;

import oracle.jdbc.driver.OracleDriver;

public class EmployeeDaoImp implements EmployeeDao{
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void openDbConnection() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int addEmployee(Employee emp) {
		openDbConnection();
		int rows = 0;
		try {
			pst = conn.prepareStatement(EmployeeDequeries.INSERT);
			pst.setInt(1, emp.getEmpcode());
			pst.setString(2, emp.getEmpname());
			pst.setString(3, emp.getJob());
			pst.setDouble(4, emp.getSalary());
			Date sqlDate = new Date(emp.getDatejoin().getTime());
			pst.setDate(5, sqlDate);
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return rows;
	}

	@Override
	public int updateEmployee(Employee emp) {
		openDbConnection();
		int rows = 0;
		try {
			pst = conn.prepareStatement(EmployeeDequeries.UPDATE);
			pst.setString(1, emp.getEmpname());
			pst.setString(2, emp.getJob());
			pst.setDouble(3, emp.getSalary());
			Date date = new Date(emp.getDatejoin().getTime());
			pst.setDate(4, date);
			pst.setInt(5, emp.getEmpcode());
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return rows;
	}

	@Override
	public int deleteEmployee(int empcode) {
		openDbConnection();
		int rows = 0;
		try {
			pst = conn.prepareStatement(EmployeeDequeries.DELETE);
			pst.setInt(1, empcode);
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return rows;
	}

	@Override
	public List<Employee> getEmployees() {
		openDbConnection();
		List<Employee> empList = new ArrayList<Employee>();
		try {
			pst = conn.prepareStatement(EmployeeDequeries.SELECT);
			rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDate(5));
				empList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return empList;
	}

	@Override
	public Employee getEmployee(int empcode) {
		openDbConnection();
		Employee emp = null;
		try {
			pst = conn.prepareStatement(EmployeeDequeries.SELECTWITHCODE);
			pst.setInt(1, empcode);
			rs = pst.executeQuery();
			while(rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDate(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return emp;
	}

}
