package webapp ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("name", request.getParameter("name"));
		
		//setting a password
		request.setAttribute("password", request.getParameter("password"));
		request.setAttribute("email", request.getParameter("e-mail"));
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

}