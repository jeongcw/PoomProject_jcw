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


		// 아이디 찾기
		$(document).on("click","#find", function(){
			console.log("들어오는지 ")
		
			var nameCheck = $("#nameCheck").val();
			var emailCheck = $("#emailCheck").val();
			alert("name = " + name + ", email = " + email);
			
			$.ajax({
				url : '/poom/find/id',
				data : {
					name : nameCheck,
					email : emailCheck
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
				},
				error : function() {
					alert("findId ajax 에러");
				}
			});
		});

</script>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	<h1>아이디 찾기</h1>
	
	<form action="id" method="post">
		이름 : <input type="text" name="name" id="nameCheck"><br />
		이메일 : <input type="email" name="email" id="emailCheck"><br />

	<input type='submit' value='찾기' id="find" onclick="">
	<input type='reset' value='취소'>
	<input type='button' onclick='location.href="/poom"' value='리스트로'>
	</form>
<jsp:include page="../include/footer.jsp"></jsp:include>