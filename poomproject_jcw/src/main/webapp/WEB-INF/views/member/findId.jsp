<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<script>
	$().ready(function() {

		// 아이디 찾기
		$("#find").click(function() {
		
			var name = $("#name").val();
			var email = $("#email").val();
			alert("name = " + name + ", email = " + email);
			
			$.ajax({
				url : '/poom/find/id',
				data : {
					name : idDupChk,
					email : email
				},
					dataType : 'text', /*html, text, json, xml, script*/
					method : 'post',
					success : function(data) {
						alert("findId ajax 성공");

						if ( data!=null ) {
							$("findedId").append("<p>찾으시는 ID는"data" 입니다.</p>");
						} else {
							$("findedId").append("<p>찾으시는 ID가 없습니다.</p>");
						}
					}
				},
				error : function() {
					alert("findId ajax 에러");
				}
			});
		
		});

	});
</script>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	<h1>아이디 찾기</h1>
	
	<form action="#" method="post">
		이름 : <input type="text" name="name" id="name"><br />
		이메일 : <input type="email" name="email" id="email"><br />
<!-- 		연락처 : <input type="tel" name="tel" id="tel"><br /> -->
<!-- 		<input type="submit" value="찾기" id="find"> -->
	</form>
	<button id="find">찾기</button>
	<div id="findedId"></div>
<jsp:include page="../include/footer.jsp"></jsp:include>