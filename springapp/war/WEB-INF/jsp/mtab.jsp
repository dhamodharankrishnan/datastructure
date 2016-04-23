<%@ include file="/WEB-INF/jsp/include.jsp"%>

<html>
<head>
<style>
<style>
TR {
    list-style-type: none;
    margin: 1;
    padding: 1;
    overflow: auto;
    background-color: #333;
}

li {
    float: left;
}

TD  {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>

</style>
</head>
<body>
	<h3>Tabs</h3>
	<TABLE>
	<c:forEach items="${model.mulTabList}" var="levelObj">
		<TR>
			<c:forEach items="${levelObj}" var="tabObj">
					<TD bgcolor='<c:out value="${tabObj.backgroundColor}" />' >
					<span class='<c:out value="${tabObj.style}" />'>
					 <c:out value="${tabObj.title}" /></span>&nbsp;&nbsp;
				
			</c:forEach>
		</TR>
	</c:forEach>
	</TABLE>
</body>
</html>