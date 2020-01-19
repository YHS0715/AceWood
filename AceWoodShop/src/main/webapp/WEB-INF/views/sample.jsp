<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  session="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <th>주소</th>
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
