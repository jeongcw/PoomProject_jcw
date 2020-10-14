<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>

	<form action="login" method="post">
		아이디 : <input type="text" name="id"><br />
		비밀번호 : <input type="password" name="pwd"><br />
		<input type="submit" value="로그인">
	</form>
	<a href="find/id">아이디</a> / <a href="find/pwd">비밀번호</a> 찾기

<jsp:include page="../include/footer.jsp"></jsp:include>