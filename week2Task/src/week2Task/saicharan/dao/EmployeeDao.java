package week2Task.saicharan.dao;

import week2Task.saicharan.bean.Employee;

public interface EmployeeDao {
	void openDbConnection();
	void close();
	int insertEmployee(Employee emp);
}
