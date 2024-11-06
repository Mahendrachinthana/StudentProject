package LoginServletAplication;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.DaoLogin;
import Modal.CourceModal;

@WebServlet("/course1")
public class CourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cource = request.getParameter("CourseName");
		String cource1 = request.getParameter("courseduration");
		int cource2 = Integer.parseInt(request.getParameter("CourseFees"));

		System.out.println("In servlet : " + cource1);
		CourceModal cModal = new CourceModal();
		cModal.setCourseName(cource);
		cModal.setCoursedDuration(cource1);
		cModal.setCourseFee(cource2);
		System.out.println("cname  : " + cModal.getCourseName());
		System.out.println("cfee  : " + cModal.getCourseFee());
		System.out.println("cduration  : " + cModal.getCoursedDuration());

		DaoLogin dc = new DaoLogin();
		String cd = dc.CourceData1(cModal);
		if (cd.equals("succes")) {
			RequestDispatcher rd1 = request.getRequestDispatcher("/Courcesucces.html");
			rd1.include(request, response);
		} else {
			RequestDispatcher rd2 = request.getRequestDispatcher("/Cource.html");
			rd2.include(request, response);
		}

	}

}
