<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome delete</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
<h1>게시글 삭제</h1>
<form action='delete' method='post'>
<input type="hidden" name="bno" value="${bno }">
    ${bno}을 진짜 지우시겠습니까? <br />
   
<input type='submit' value='삭제'>
<input type='reset' value='취소'>
<input type='button' onclick='location.href="list"' value='리스트로'>
</form>
<jsp:include page="../include/footer.jsp"></jsp:include>