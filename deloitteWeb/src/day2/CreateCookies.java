package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookies
 */
@WebServlet("/CreateCookies")
public class CreateCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		Cookie ck1 = new Cookie("id","aaaaid");
		Cookie ck2 = new Cookie("username","saicharan");
		Cookie ck3 = new Cookie("email","gmail@gmailcom");
		pw.print("cookies created");
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
