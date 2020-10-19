<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	<h1>아이디 찾기</h1>
	
	<form action="id" method="post">
		이름 : <input type="text" name="name" id="nameCheck"><br />
		이메일 : <input type="email" name="email" id="emailCheck"><br />

		<input type='submit' value='찾기'>
		<input type='reset' value='취소'>
		<input type='button' onclick='location.href="/poom/login"' value='리스트로'>
	</form>
<jsp:include page="../include/footer.jsp"></jsp:include>