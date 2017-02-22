import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispater extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String id = request.getParameter("id");

		RequestDispatcher rs = request.getRequestDispatcher("ins.jsp");
		rs.forward(request, response);
		System.out.println("Id is :" + id);
		System.out.println("Name is :" + name);
	}
}
