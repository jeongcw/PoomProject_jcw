<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome List</title>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>

<h1>신고 결과</h1>
<b>정상적으로 접수 되었습니다</b>
<a href="list">리스트로 이동하시려면 클릭을 아니면 5초후에 자동이동합니다</a>
<script>
	setTimeout(function() {window.location='list';},5000)
</script>

<jsp:include page="../include/footer.jsp"></jsp:include>