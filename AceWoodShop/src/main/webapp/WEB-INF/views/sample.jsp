<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" session="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Sample</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<table>
    <tr>
        <th>이름</th>
        <th>ID</th>
        <th>PW</th>
    </tr>
    <c:forEach items="${memberList}" var="member">
    <tr>
        <td>${member.memberNm}</td>
        <td>${member.memberId}</td>
        <td>${member.memberPw}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
