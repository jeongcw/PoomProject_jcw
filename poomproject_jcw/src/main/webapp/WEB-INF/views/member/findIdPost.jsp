<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기 결과</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	<p>찾으시는 아이디는 ${findIdDTO.id} 입니다.</p>
	<p>아이디는 메일로 보내드립니다.</p>
	<p>5초후 메인 홈페이지로 이동됩니다.</p>
	
<script>
setTimeout( function() { window.location='/poom'; } ,5000);
</script>

<jsp:include page="../include/footer.jsp"></jsp:include>