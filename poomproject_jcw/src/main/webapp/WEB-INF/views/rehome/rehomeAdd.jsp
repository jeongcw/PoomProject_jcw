<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rehome add</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
<h1>게시물등록 연습</h1>
<form action='add' method='post'>

  <select name="type_b" id="type_b">
    <option value="0" selected>분양</option>
    <option value="1">소통</option>
    <option value="2">공지</option>
  </select>
  <br><br>
  
  <select name="cat_r" id="cat_r">
    <option value="0" selected>1~4를 선택!</option>
    <option value="1">멍멍</option>
    <option value="2">냥냥</option>
    <option value="3">첨벙</option>
    <option value="4">짹짹</option>
  </select>
  <br><br>
 
  성별<select name="gender" id="gender"><br>
    <option value="0">암컷</option>
    <option value="1">수컷</option>
    <option value="2" selected>모름</option>
  </select><br>
  
  접종여부<select name="neut" id="neut"><br>
    <option value="0">했음</option>
    <option value="1">안했음</option>
    <option value="2" selected>모름</option>
  </select><br>
  
  중성화여부<select name="vac" id="vac"><br>
    <option value="0">했음</option>
    <option value="1">안했음</option>
    <option value="2" selected>모름</option>
  </select><br>
  
  분양가<input type="text" name="cost"><br>
  분양글번호<input type="text" name="rno"><br>
  회원번호<input type="text" name="mno"><br>
  좋아요수<input type="text" name="likecnt"><br>
  신고수<input type="text" name="reportcnt"><br>
  회원상태<input type="text" name="stmt_b"><br>
  제목<input type="text" name="title"><br>
  글쓴이<input type="text" name="id_writer"><br>
  <textarea id="cont_b" name="cont_b" rows="20" cols="100">
 
  </textarea><br>
  
  <input type="submit" value="Submit"><br>
</form>
<jsp:include page="../include/footer.jsp"></jsp:include>