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

	<c:forEach var="vo" items="${list }" varStatus="a"> /<!--varStatus - 값넣기-->
		${a.index} <!--index, count 2개 정도 쓸 수 있음-->
		${a.count}
		 
		이름: ${vo.name } <br>
		국어점수: ${vo.kor } <br>
		영어점수: ${vo.eng } <br>
		수학점수: ${vo.math } <br>
		
		<button type="button" onclick="location.href='deleteScore?sno=${vo.sno}';">삭제</button>
	
	</c:forEach>
	
	<a href="scoreRegist">추가등록하기</a>
	
	
		<table>
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>내용</td>
			<td>비고</td>
		</tr>
	
		<tr>
			<td>~~</td>
			<td>~~</td>
			<td>~~</td>
			<td>~~</td>
			<td><input type="button" value="삭제" onclick="location.href='deleteBoard?sno=${vo.sno}';">삭제</td>
		</tr>

			<!-- 
			1. boardDelete로 삭제 처리하세요. 
			2. 삭제 후엔 목록화면으로 리다이렉트 하세요.
			-->
	</table>
	

</body>
</html>