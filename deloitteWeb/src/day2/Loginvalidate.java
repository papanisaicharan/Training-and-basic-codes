package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

@WebServlet("/Loginvalidate")
public class Loginvalidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String p = null;
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		if(isNullOrEmpty(name) && isNullOrEmpty(password)) {
			pw.print("field are empty");
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		} else if(isNullOrEmpty(name)) {
			pw.print("name is empty");
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		} else if(isNullOrEmpty(password)) {
			pw.print("password is empty");
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}else {
			pw.print("fine");
			if(name.equals("admin")) {
				rd = request.getRequestDispatcher("Admin");
			}else {
				rd = request.getRequestDispatcher("User");
			}
			rd.forward(request, response);
		}		
		pw.print("done");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
