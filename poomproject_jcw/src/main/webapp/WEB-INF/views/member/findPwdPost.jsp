<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비번 찾기 결과</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	<p>pwd는 메일로 보내드립니다. </p>
	<p>10초후 메인 홈페이지로 이동됩니다.</p>
	
<script>
setTimeout( function() { window.location='/poom/login'; } ,10000);
</script>
	
<jsp:include page="../include/footer.jsp"></jsp:include>