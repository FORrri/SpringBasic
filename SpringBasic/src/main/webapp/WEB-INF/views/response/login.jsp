<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ㄱ
	<h3>리다이렉트?</h3>
	
	<form action="loginForm" method="post">
		아이디: <input type="text" name="id">
		비밀번호: <input type="password" name="pw">
		<input type="submit">
	</form>
	
	${msg }
	
</body>
</html>