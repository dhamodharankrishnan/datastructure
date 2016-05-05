<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<TABLE border="1" cellspacing="1" cellpadding="1">
		<TR>
			<TD>
			  	<a href="<c:url value="hello.htm"/>">Home</a>
			</TD>
			<TD>
			  	<a href="<c:url value="inventory.htm"/>">Inventory</a>
			</TD>
			<TD>
			  	<a href="<c:url value="studentlist.htm"/>">Student List</a>
			</TD>
			<TD>
			  	<a href="<c:url value="studentinfo.htm"/>">Add Student</a>
			</TD>
			
		</TR>
	</TABLE>

