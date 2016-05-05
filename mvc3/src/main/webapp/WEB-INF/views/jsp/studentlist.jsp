<%@ include file="/WEB-INF/views/jsp/include.jsp"%>

<html>
<head>
<title>Students</title>
</head>
<body>
	<h3>Students</h3>
		<TABLE border="1" cellspacing="1" cellpadding="1" bgColor="blue">
			<TR>
				<TH>ID</TH>
				<TH>Name</TH>
				<TH>Age</TH>
				<TH>Sex</TH>
				<TH>Grade</TH>
				<TH>Country</TH>
			</TR>
			
			<c:forEach items="${model.studentList}" var="student">
				<TR>
					<TD> <c:out value="${student.rollNumber}" /> </TD>
					<TD> <c:out value="${student.name}" /> </TD>
					<TD> <c:out value="${student.age}" /> </TD>
					<TD> <c:out value="${student.sex}" /> </TD>
					<TD> <c:out value="${student.grade}" /> </TD>
					<TD> <c:out value="${student.country}" /> </TD>
				</TR>
			</c:forEach>
		</TABLE>
		<a href="<c:url value="studentinfo.htm"/>">Add Student</a>
</body>

</html> 