<%@ include file="/WEB-INF/jsp/include.jsp"%>

<html>
<head>
<title><fmt:message key="student.title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="student.heading" />
	</h1>
	<p>
		<fmt:message key="student.greeting" />
	</p>
	<h3>Students</h3>
		<TABLE border="1" cellspacing="1" cellpadding="1" bgColor="blue">
			<TR>
				<TH>ID</TH>
				<TH>Name</TH>
				<TH>Age</TH>
				<TH>Sex</TH>
			</TR>
			<c:forEach items="${model.studentList}" var="student">
				<TR>
					<TD> <c:out value="${student.rollNumber}" /> </TD>
					<TD> <c:out value="${student.name}" /> </TD>
					<TD> <c:out value="${student.age}" /> </TD>
					<TD> <c:out value="${student.sex}" /> </TD>
				</TR>
			</c:forEach>
		</TABLE>
</body>

</html> 