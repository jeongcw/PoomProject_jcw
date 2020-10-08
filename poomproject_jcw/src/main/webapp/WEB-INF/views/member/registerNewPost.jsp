<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 회원가입 완료</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>

<%-- 	<img style="border-radius:20px" src="${pageContext.request.contextPath }/resources/img/baseProf.png" alt="" width="40px" height="40px"> --%>
	<img style="border-radius:20px" src="${imgSrc}" alt="" width="40px" height="40px">
	${name}님, 회원가입이 완료되었습니다! (알럿처럼 띄우기!)

<jsp:include page="../include/footer.jsp"></jsp:include>