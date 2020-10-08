<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome Update</title>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>

<form id='report' action='report' method='post'>

글번호 : <input type="text" name="bno" value="${rehomeGetOne1.bno }" readonly><br><br>

신고내용<br>
<textarea id="report_cont" name="report_cont" rows="20" cols="100" >
	 ${rehomeGetOne1.report_cont}
  </textarea><br>
 
<input type='submit' value='전송'>
<input type='reset' value='취소'>
<input type='button' onclick='location.href="list"' value='리스트로'>

</form><jsp:include page="../include/footer.jsp"></jsp:include>