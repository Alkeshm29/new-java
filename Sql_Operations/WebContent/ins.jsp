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
	PreparedStatement ps2 = con.prepareStatement("insert into Student values(?,?)");
				ps2.setString(1, id);
				ps2.setString(2,name);
				int i = ps2.executeUpdate();
				out.println(i + "Record is inserted");
%>
				</body>
</html>