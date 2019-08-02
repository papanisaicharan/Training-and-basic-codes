package com.deloitte.employee.Appservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.dao.impl.EmployeeDaoImp;

/**
 * Servlet implementation class SelectEmployees
 */
@WebServlet("/SelectEmployees")
public class SelectEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		EmployeeDao dao = new EmployeeDaoImp();
		List<Employee> list = dao.getEmployees();
		request.setAttribute("empls", list);
		RequestDispatcher rd = request.getRequestDispatcher("viewEmpls.jsp");
		rd.forward(request, response);
		
		// below is the code for servlet
//		pw.print("	<table border=3 width='100%'>\r\n" + 
//				"	<tr>\r\n" + 
//				"		<th>empcode</th>\r\n" + 
//				"		<th>empname</th>\r\n" + 
//				"		<th>job</th>\r\n" + 
//				"		<th>salary</th>\r\n" + 
//				"		<th>datejoin</th>\r\n" + 
//				"	</tr>");
//		for(Employee emp : list) {
//			pw.print(emp);
//		}
//		pw.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
