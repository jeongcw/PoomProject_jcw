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
	<img src="${prof}" alt="" width="100px" height="100px">
	${name}님, 회원가입이 완료되었습니다! (알럿처럼 띄우기!)
		
<script>
	function loadFunc() {
		var completed = confirm("${name}님의 회원가입이 완료되었습니다!");
		if ( completed == true ) {	// 확인 누르면 메인 페이지로 이동
			window.location.href="/poom";
		} else {
			window.location.href="/poom";
		}
	}
	window.onload = loadFunc;
</script>

<jsp:include page="../include/footer.jsp"></jsp:include>