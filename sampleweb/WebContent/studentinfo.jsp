<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>

<!-- Get data through useBean -->
<jsp:useBean id="studentList" type="java.util.List<java.lang.String>" scope="request"></jsp:useBean>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Info JSP</title>
</head>
<body>

	<!-- Scriptlet -->
	<%
//		List<String> studentList = (List<String>) request.getAttribute("studentList");
	%>
	<table border="1" cellpadding="1" cellspacing="1">
		<%
			Iterator<String> studIter = studentList.iterator();
			while (studIter.hasNext()) {
		%>
		<TR>
			<TD bgcolor="red">
				<%
					String studentName = studIter.next();
				%>
				<%=studentName%>
				
			</TD>
		</TR>
		<%
			}
		%>

	</table>

<form action="/sampleweb/student" method="GET">

	<table>
		<tr>
			<td>
				Name:
			</td>
			<td>
				<input type="text" name="txtName" />
			</td>
		</tr>
		<tr>
			<td>
				Place:
			</td>
			<td>
				<input type="text" name="txtPlace" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="btnSubmit" />
			</td>
		</tr>
	</table>
</form>

</body>
</html>