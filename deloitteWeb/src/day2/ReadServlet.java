package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw1 = response.getWriter();
		HttpSession ssn1 = request.getSession();
		pw1.print(ssn1.getAttribute("id"));
		pw1.print(ssn1.getAttribute("name"));
		pw1.print(ssn1.getAttribute("null"));
		pw1.print(ssn1.getId()+"<br>");
		pw1.print(ssn1.getCreationTime()+"<br>");
		pw1.print(ssn1.getLastAccessedTime());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
