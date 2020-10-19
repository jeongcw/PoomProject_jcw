<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
<h1>비밀번호 찾기</h1>

<form action="pwd" method="post">
	<label><b>아이디 :</b></label>
	<input type="text" name="id" id="id" placeholder="ID"><br>
	<label><b>이름 :</b></label>
	<input type="text" name="name" id="name" placeholder="이름"><br>
	<label><b>이메일 :</b></label>
	<input type="text" name="email" id="email" placeholder="email"><br>
	<input type='submit' value='찾기'>
	<input type='reset' value='취소'>
	<input type='button' onclick='location.href="/poom/login"' value='돌아가기'>
</form>
<jsp:include page="../include/footer.jsp"></jsp:include>