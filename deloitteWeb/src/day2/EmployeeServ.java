package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServ
 */
@WebServlet("/EmployeeServ")
public class EmployeeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int code = Integer.parseInt(request.getParameter("code"));
		String job = request.getParameter("job");
		String skills[] = request.getParameterValues("lang");
		pw.print("user details {<br>");
		pw.print("code : "+code + "<br>");
		pw.print("name : "+name + "<br>");
		pw.print("salary : "+salary + "<br>");
		pw.print("job : "+job + "<br>");
		for(String s: skills)
			pw.print("skills : "+ s + "<br>");
		pw.print("}");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
