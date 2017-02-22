import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyClass extends HttpServlet {
	String id, name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m = new MyClass();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		name = request.getParameter("name");
		id = request.getParameter("id");
		
	}

	public void dis() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");

			PreparedStatement ps = con.prepareStatement("select * from Student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
		}
	}

	public void del() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");
			PreparedStatement ps3 = con.prepareStatement("delete from Student where id=?");

			// String id=request.getParameter("id");
			ps3.setString(1, id);
			int i = ps3.executeUpdate();
			System.out.println(i + "Record Deleted");
			con.close();
		} catch (Exception e) {
		}
	}

	public void ins() {
		try {
			// String id=request.getParameter("id");
			// String name=request.getParameter("name");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");
			PreparedStatement ps2 = con.prepareStatement("insert into Student values(?,?)");
			ps2.setString(1, id);
			ps2.setString(2, name);
			int i = ps2.executeUpdate();
			System.out.println(i + "Record is inserted");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void up() {/*
						 * String id=request.getParameter("id"); String
						 * name=request.getParameter("name");
						 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");
			PreparedStatement ps4 = con.prepareStatement("update Student set name=? where id=?");
			ps4.setString(1, name);
			ps4.setString(2, id);
			int i = ps4.executeUpdate();
			System.out.println(i + "Record Update");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}