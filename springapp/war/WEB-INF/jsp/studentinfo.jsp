<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Student Information</title>
</head>
<body>
	<form:form method="post" commandName="studentInfo">
		<table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0"
			cellpadding="5">
			<tr>
				<td align="right" width="20%">Roll No:</td>
				<td width="*"><form:input path="rollNumber" /></td>
			</tr>
			<tr>
				<td align="right" width="20%">Name:</td>
				<td width="*"><form:input path="studentName" /></td>
			</tr>
			<tr>
				<td align="right" width="20%">Age:</td>
				<td width="*"><form:input path="age" /></td>
			</tr>
			<tr>
				<td align="right" width="20%">Sex:</td>
				<td width="*">
				<form:radiobutton path="sex" value="M" />Male 
				<form:radiobutton path="sex" value="F" />Female</td>
			</tr>
			<tr>
				<td align="right" width="20%">Grade:</td>
				<td width="*">
					<form:select path="grade" items="${gradeMap}" multiple="true" />
				</td>
			</tr>
			<tr>
				<td align="right" width="20%">Country:</td>
				<td width="*">
					<form:select path="country" items="${countryMap}" />
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" align="center" value="Execute">

	</form:form>
</body>
</html>
