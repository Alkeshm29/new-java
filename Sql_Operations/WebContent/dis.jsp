<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>

<%@page import="javax.sql.*" %>

<%@page import="java.sql.Connection" %>
<%
	
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	
	out.println("Id is :"+id);
	out.println("Name is :"+name);

	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "bridgeit");
	PreparedStatement ps = con.prepareStatement("select * from Student");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getInt(1) + " " + rs.getString(2));
	}
	con.close();
	%>
</body>
</html>