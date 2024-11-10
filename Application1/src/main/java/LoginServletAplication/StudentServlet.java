package LoginServletAplication;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.DaoLogin;
import Modal.StudentModal;
@WebServlet("/Student")

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String boy = request.getParameter("FirstName");
		String boy1 = request.getParameter("LastName");
		String boy2 = request.getParameter("FatherName");
		String boy3 = request.getParameter("MotherName");
		String boy4 = request.getParameter("StudentSubject");
		String boy5 = request.getParameter("Adresh");
		String boy6 = request.getParameter("Mail");
		String boy7 = request.getParameter("PhoneNumber");
		String boy8 = request.getParameter("Alternate");
		int boy9 = Integer.parseInt(request.getParameter("cid"));

		StudentModal modal = new StudentModal();
		modal.setFirstName(boy);
		modal.setLastName(boy1);
		modal.setFatherName(boy2);
		modal.setMotherName(boy3);
		modal.setStudentSubject(boy4);
		modal.setAdresh(boy5);
		modal.setMail(boy6);
		modal.setPhoneNumber(boy7);
		modal.setAlternate(boy8);
		modal.setCid(boy9);
		
		DaoLogin obj2=new DaoLogin();
		
		
		String status = obj2.StudentData(modal);
		if (status.equals("succes")) {
			RequestDispatcher rd1 = request.getRequestDispatcher("/Studentsucces.html");
			rd1.include(request, response);
		} else {
			RequestDispatcher rd2 = request.getRequestDispatcher("/Student.html");
			rd2.include(request, response);
		}

		
		

	}

}
