package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Modal.CourceModal;
import Modal.FacultyModal;
import Modal.LoginModal;

import Modal.StudentModal;



public class DaoLogin {
	public String LoginData(LoginModal ml) {
		String status = "fild";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendra", "root", "root");
			PreparedStatement ps = con.prepareStatement("select*from Admin01 where mail=? and password =?");
			ps.setString(1, ml.getMail());
			ps.setString(2, ml.getPassword());
		
			ResultSet n = ps.executeQuery();
			while (n.next()) {
				status = "succes";
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return status;

	}
	public String StudentData(StudentModal sdm) {
		String status = "fild";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendra", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"insert into student01(FirstName,LastName,FatherName,MotherName,StudentSubject,Adresh,Mail,PhoneNumber,Alternate,cid) values (?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, sdm.getFirstName());
			ps.setString(2, sdm.getLastName());
			ps.setString(3, sdm.getFatherName());

			ps.setString(4, sdm.getMotherName());

			ps.setString(5, sdm.getStudentSubject());

			ps.setString(6, sdm.getAdresh());

			ps.setString(7, sdm.getMail());

			ps.setString(8, sdm.getPhoneNumber());
			ps.setString(9, sdm.getAlternate());
			ps.setInt(10, sdm.getCid());
			int n = ps.executeUpdate();
			if (n > 0) {
				status = "succes";
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return status;

	}
	public String FacultyData1(FacultyModal sdm1) {
		String status = "fild";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendra", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"insert into faculty01(FacultyFistname,FacultyLastname,FacultySubject,PhoneNumber,Mail,Adresh,cid) values (?,?,?,?,?,?,?)");

			ps.setString(1, sdm1.getFacultyFistname());
			ps.setString(2, sdm1.getFacultyLastname());
			ps.setString(3, sdm1.getFacultySubject());

			ps.setString(4, sdm1.getPhoneNumber());

			ps.setString(5, sdm1.getMail());

			ps.setString(6, sdm1.getAdresh());

			ps.setInt(7, sdm1.getCid());

			int n = ps.executeUpdate();
			if (n > 0) {
				status = "succes";
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return status;

	}
	
	public String CourceData1(CourceModal cm) {
		String status = "fild";
		System.out.println("cname  : "+cm.getCourseName());
		System.out.println("cfee  : "+cm.getCourseFee());
		System.out.println("cduration  : "+cm.getCoursedDuration());

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahendra", "root", "root");
			PreparedStatement ps1 = con.prepareStatement( "insert into course01(CourseName,CoursedDuration,CourseFee) values (?,?,?)");
 
			ps1.setString(1, cm.getCourseName());
			ps1.setString(2, cm.getCoursedDuration());
			ps1.setInt(3, cm.getCourseFee());

			int m = ps1.executeUpdate();
			if (m > 0) {
				status = "succes";
			
			}	
	}catch (Exception e) {
		System.out.println(e);

	}
	return status;


}
	}
