<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 회원가입</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<script>
	$().ready(function() {

		// ID 중복체크
		$("#idDupChk").change(function() {
		
			var idDupChk = $("#idDupChk").val();
			//alert("idDupChk = " + idDupChk);
			
			$.ajax({
				url : '/poom/register/idDupChk',
				data : {
					id : idDupChk
				},
					dataType : 'text', /*html, text, json, xml, script*/
					method : 'post',
					success : function(data) {
						//alert("idDupChk ajax 성공");
					
						if ( data==0 ) {
							//alert("중복되지 않은 ID");
							$("#idDupChkRet").attr("type", "text");
							$("#idDupChkRet").attr("style", "color:green;");
							$("#idDupChkRet").val("사용가능한 ID입니다.");
						} else if ( data==1 ){
							//alert("중복된 ID");
							$("#idDupChkRet").attr("type", "text");
							$("#idDupChkRet").attr("style", "color:red;");
							$("#idDupChkRet").val("이미 사용중인 ID입니다.");
						} else {
							//alert("에러");
							$("#idDupChkRet").val("관리자에게 문의하세요.");
					}
				},
				error : function() {
					//alert("idDupChk ajax 에러");
				}
			});
		
		});

		// email 중복체크
		$("#emailDupChk").change(function() {
			
			var emailDupChk = $("#emailDupChk").val();
			//alert("emailDupChk = " + emailDupChk);
			
			$.ajax({
				url : '/poom/register/emailDupChk',
				data : {
					email : emailDupChk
				},
					dataType : 'text',
					method : 'post',
					success : function(data) {
						//alert("emailDupChk ajax 성공");
					
						if ( data==0 ) {
							//alert("중복되지 않은 email");
							$("#emailDupChkRet").attr("type", "text");
							$("#emailDupChkRet").attr("style", "color:green;");
							$("#emailDupChkRet").val("사용가능한 email입니다.");
						} else if ( data==1 ){
							//alert("중복된 eamil");
							$("#emailDupChkRet").attr("type", "text");
							$("#emailDupChkRet").attr("style", "color:red;");
							$("#emailDupChkRet").val("이미 사용중인 email입니다.");
						} else {
							//alert("에러");
							$("#emailDupChkRet").val("관리자에게 문의하세요.");
					}
				},
				error : function() {
					//alert("pwdDupChk ajax 에러");
				}
			});
		
		});

		// pwd 일치확인
		$("#pwdMatChk").change(function() {

			var pwd = $("#pwd").val();
			var pwdMatChk = $("#pwdMatChk").val();
			//alert("pwd = " + pwd);
			//alert("pwdMatChk = " + pwdMatChk);

			if ( pwd==pwdMatChk ) {
				//alert("pwd 일치");
				$("#pwdMatChkRet").attr("type", "text");
				$("#pwdMatChkRet").attr("style", "color:green;");
				$("#pwdMatChkRet").val("비밀번호가 일치합니다.");
			} else {
				//alert("pwd 불일치");
				$("#pwdMatChkRet").attr("type", "text");
				$("#pwdMatChkRet").attr("style", "color:red;");
				$("#pwdMatChkRet").val("비밀번호가 다릅니다.");
			}
			
		});
		
	});
</script>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>

	<form action="new" method="post" id="registerNewForm" enctype="multipart/form-data">
		아이디 : 
			<input type="text" name="id" id="idDupChk"><br />
			<input type="hidden" id="idDupChkRet"><br />
		비밀번호 : 
			<input type="password" id="pwd"><br />
		비밀번호 확인 : 
			<input type="password" name="pwd" id="pwdMatChk"><br />
			<input type="hidden" id="pwdMatChkRet"><br />
		이메일 : 
			<input type="email" name="email" id="emailDupChk"><button>본인인증</button><br />
			<input type="hidden" id="emailDupChkRet"><br />
		이름 : 
			<input type="text" name="name"><br />
		주소 : 
			<input type="text" name="address"><br />
		연락처 : 
			<input type="tel" name="tel"><br />
		멘트 : 
			<input type="text" name="ment"><br />
 		프로필 사진 : 
			<input type="file" name="prof" value=""><button>업로드?</button><br />
		관심 분야 : 
			<select form="registerNewForm" name="fav">
        		<option value="0">선택안함</option>
        		<option value="1">강아지</option>
        		<option value="2">고양이</option>
        		<option value="3">물고기</option>
        		<option value="4">새</option>
        		<option value="5">기타</option>
   			</select><br />
		애완동물 유무 : 
			<select form="registerNewForm" name="pet">
        		<option value="0">선택안함</option>
        		<option value="1">유</option>
        		<option value="2">무</option>
   			</select><br />
		<input type="submit" value="가입하기">
	</form>

<jsp:include page="../include/footer.jsp"></jsp:include>