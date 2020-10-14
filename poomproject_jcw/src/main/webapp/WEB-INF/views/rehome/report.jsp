<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신고페이지</title>
</head>

<body>
<form id='report' action='report' method='post'>

글번호 : <input type="text" name="bno" value="${rehomeGetOne1.bno }" readonly><br><br>

신고내용<br>
<textarea id="report_cont" name="report_cont" rows="20" cols="50" >
	 ${rehomeGetOne1.report_cont}
  </textarea><br>
 
<input type='submit' value='전송'>
<input type='reset' value='취소'>
</form>
</body>
</html>
