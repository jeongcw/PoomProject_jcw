<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
	<jsp:include page="./include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="./include/header.jsp"></jsp:include>

	<br /><br /><br />
	<a href="/poom">품으로 메인 페이지로 이동!</a>

<P>  The time on the server is ${serverTime}. </P>
<jsp:include page="./include/footer.jsp"></jsp:include>