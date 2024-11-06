package LoginServletAplication;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.DaoLogin;
import Modal.LoginModal;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String man =request.getParameter("mail");
		String man1 =request.getParameter("password");
		String man2 =request.getParameter("role");
		LoginModal n =new LoginModal();
		n.setMail(man);
		n.setPassword(man1);
		n.setRole(man2);
		
		DaoLogin boss=new DaoLogin();
	   String p=boss.LoginData(n);
	   if (p.equals("succes")) {
			RequestDispatcher rd1 = request.getRequestDispatcher("/Adminpage.html");
			rd1.include(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			rd.include(request, response);

		}



	}

}
