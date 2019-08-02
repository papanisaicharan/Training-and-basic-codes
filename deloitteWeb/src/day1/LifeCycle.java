package day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int count = 0;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("*** inti is called ***");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("*** destroy is called ***");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter ps = response.getWriter();
		ps.println("hello servlet<br>");
		ps.println("<h3> sample </h3>");
		count++;
		ps.println( "Server is loading for " + count +"th time.");
	}

}
