package week2Task.saicharan.dao.Imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;
import week2Task.saicharan.bean.Employee;
import week2Task.saicharan.dao.EmployeeDao;
import week2Task.saicharan.dao.variables.Queries;

public class EmployeeDaoImp implements EmployeeDao{
	private Connection conn;
	private PreparedStatement ps;
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
	public void close() {
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public int insertEmployee(Employee emp) {
		int rows = 0 ;
		openDbConnection();
		try {
			ps = conn.prepareStatement(Queries.INSERT);
			ps.setString(1,emp.getFname() );
			ps.setString(2, emp.getLastname());
			ps.setString(3, emp.getEmpid());
			Date dt = new Date(emp.getDob().getTime());
			ps.setDate(4, dt);
			ps.setString(5, emp.getAddress());
			rows  = ps.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rows > 0) {
			return rows;
		}
		return 0;
	}

}
