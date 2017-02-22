<%@page import="java.sql.*" %>

<%@page import="javax.sql.*" %>

<%@page import="java.sql.Connection" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	
	out.println("Id is :"+id);
	out.println("Name is :"+name);
	
	//int id;
	String name1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");

			System.out.println("1.Display 2.Insert 3.Delete 4.Update");
			//Scanner sc = new Scanner(System.in);
			//int ch = sc.nextInt();

		//	switch (ch) {
		//	case 1:

				PreparedStatement ps = con.prepareStatement("select * from Student");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2));
				}
				con.close();

			//	break;
		//	case 2:
				PreparedStatement ps2 = con.prepareStatement("insert into Student values(?,?)");
				System.out.println("Enter id");
			//	id=sc.nextInt();
				System.out.println("Enter Nmae");
			//	name1=sc.next();
				ps2.setString(1, id);
				ps2.setString(2,name);
				int i = ps2.executeUpdate();
				System.out.println(i + "Record is inserted");

			//	break;
		//	case 3:
				PreparedStatement ps3=con.prepareStatement("delete from Student where id=?");  
				System.out.println("Enter id for Delete");
			//	id=sc.nextInt();
				ps3.setString(1,id);
				i = ps3.executeUpdate();
				System.out.println(i + "Record Deleted");
				con.close();

			//	break;
		//	case 4:
				PreparedStatement ps4 = con.prepareStatement("update Student set name=? where id=?");
				System.out.println("Enter id");
		//		id=sc.nextInt();
				System.out.println("Enter Nmae");
			//	name1=sc.next();
				ps4.setString(1, name);
				ps4.setString(2, id);
				i = ps4.executeUpdate();
				System.out.println(i + "Record Update");
				con.close();
			//	break;

		//	default:
		//		break;
						} catch (Exception e) {
		}
	
%>
</body>
</html>