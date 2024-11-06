package LoginServletAplication;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.DaoLogin;
import Modal.FacultyModal;

@WebServlet("/Faculty2")
public class FacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FacultyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String faculty = request.getParameter("FacultyFistname");
		String faculty1 = request.getParameter("FacultyLastname");
		String faculty2 = request.getParameter("FacultySubject");
		String faculty3 = request.getParameter("PhoneNumber");
		String faculty4 = request.getParameter("Mail");
		String faculty5 = request.getParameter("Adresh");
		int faculty6 = Integer.parseInt(request.getParameter("cid"));

		FacultyModal fm = new FacultyModal();
		fm.setFacultyFistname(faculty);
		fm.setFacultyLastname(faculty1);
		fm.setFacultySubject(faculty2);
		fm.setPhoneNumber(faculty3);
		fm.setMail(faculty4);
		fm.setAdresh(faculty5);
		fm.setCid(faculty6);
		DaoLogin dL =new DaoLogin();
		String fS=dL.FacultyData1(fm);
		if (fS.equals("succes")) {
			RequestDispatcher rd1 = request.getRequestDispatcher("/Facultysucces.html");
			rd1.include(request, response);
		} else {
			RequestDispatcher rd2 = request.getRequestDispatcher("/Faculty.html");
			rd2.include(request, response);
		}
		

	}

}
