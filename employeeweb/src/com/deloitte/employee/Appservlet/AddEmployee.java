package com.deloitte.employee.Appservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		int empcode = Integer.parseInt(request.getParameter("empcode"));
		String empname = request.getParameter("empname");
		String job = request.getParameter("empname");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String datejoin = request.getParameter("datejoin");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt=null;
		try {
			dt = sdf.parse(datejoin);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Employee emp = new Employee(empcode,empname,job,salary,dt);
		EmployeeDao dao = new EmployeeDaoImp();
		int rows = dao.addEmployee(emp);
		if(rows > 0) {
			pw.println("<h1>"+rows + " inserted.</h1>");
		}else {
			pw.println("<h1>Not inserted.</h1>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
