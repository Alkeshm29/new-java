

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.ForwardRequest;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		String id=request.getParameter("id");
//		String name=request.getParameter("name");
//		
		MyClass myClass = new MyClass();
        if (request.getParameter("button1") != null) {
        	System.out.println("B1");
        	myClass.ins();
        } else if (request.getParameter("button2") != null) {
           // myClass.del();
        	System.out.println("b2");
        } else if (request.getParameter("button3") != null) {
            myClass.dis();
        }else if (request.getParameter("button3") != null) {
            myClass.up();
        }else {
            // ???
        }
        //doGet(request, response);
	}

}
