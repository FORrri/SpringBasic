<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="vo" items="${list }">
		이름: ${vo.name } <br>
		국어점수: ${vo.kor } <br>
		영어점수: ${vo.eng } <br>
		수학점수: ${vo.math } <br>
	
	</c:forEach>
	
	<a href="scoreRegist">추가등록하기</a>
	
	

</body>
</html>