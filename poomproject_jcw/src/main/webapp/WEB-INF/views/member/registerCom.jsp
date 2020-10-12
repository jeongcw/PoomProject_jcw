<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<jsp:include page="../include/inHead.jsp"></jsp:include>
<script>
//--------------정규식 var모음----------------------



//아이디 정규식-8~12자의 영문 소문자, 숫자만 사용 가능합니다.
var idR=/^[a-z0-9]{8,12}$/;
//비밀번호 정규식-7~15자의 영문 대소문자, 숫자와 특수기호~!@\#$%<>^&*로만 사용 가능합니다.
var pwdR=/.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*/;
//이메일 검사 정규식-이메일 양식을 확인해주세요 
var emailR=/^[a-zA-Z0-9._-]+@[a-zA-z0-9.-]+\.[a-zA-Z]{2,4}$/

// /^[a-zA-Z0-9!#$%^&*_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+){1,2}$/;


//휴대폰 번호 정규식-'-'없이 번호만 입력해주세요
var phoneR=/^01([0|1|?)?([0-9]{8,9})$/;


		
//-----------------------------------------------------------------

  //ID 중복체크 및 정규식 실행문 
  function checkId(){
	 var regExIdResult = regExId(); //정규식 실행문
	 //alert("regExIdResult",regExIdResult);
	 //console.log("regExIdResult",regExIdResult)
	 
	 if (regExIdResult == true ) {
	 	//console.log("")
		//alert("유효성체크확인 들어옴")
		var idDupChk = $('#idDupChk').val();
		//alert ("idDupChk = " + idDupChk);

		$.ajax({
				url : '/poom/register/idDupChk',
				data : {
					id : idDupChk
				},
					dataType : 'text' , // html, text, json, xml, script
					method : 'post',
					success : function(data) {
						//alert("idDupChk ajax 성공");
					if ( data == 0 ) {
							alert ("중복되지 않은 ID입니다.");
							$('#idDupChkRet').text('사용가능한 ID입니다.');
						    $('#idDupChkRet').css('color', 'green');

						} else if ( data == 1 ) {
							//alert("중복된 ID입니다.")
							$('#idDupChkRet').text('사용 불가능한 ID입니다');
						    $('#idDupChkRet').css('color', 'green');

						} else {
							//alert("에러");
							$("#idDupChkRet").text("관리자에게 문의하세요.");
						}
					},
					error : function() {
						alert("idDupChk ajax 에러")
					}
		});
  	   }
	}

 //클릭하면 바로 텍스트 보여줌 활성화 하자
 $(document).ready(function(){
	   $('#idDupChk').focus(function() {
		   regExId();
	   });

	   $('#pwd').focus(function() {
		      checkPwd();
	   });
	});
	
 function regExId(){
	    //아이디 유효성 검사(정규식)
	    if($('#idDupChk').val() == ''){
	       $('#idDupChkRet').text('아이디를 입력해주세요');
	       $('#idDupChkRet').css('color', 'red');
	   } else if(idR.test( $('#idDupChk').val() ) != true){
	      $('#idDupChkRet').text('8~12자의 영문 소문자, 숫자만 사용 가능합니다.');
	      $('#idDupChkRet').css('color', 'red');
	      return false;
	   } else {
	       return true;
	   }
	 }


 
//-----------------------------------------------------------------
 //비번 유효성 검사 
  //클릭하면 바로 텍스트 보여줌 활성화 하자

 
 function checkPwd(){
	 if(pwdR.test( $("#pwd").val()) == true) {
		 $("#pwdRet").text("사용가능한 비밀번호 입니다.");
		 $("#pwdRet").css("color",'green');
		 return true;
	 } else {
		 $("#pwdRet").text("특수문자 / 문자 / 숫자 포함 형태의 8~15자리 이내의 암호 정규식로만 사용 가능합니다.");
		 $("#pwdRet").css("color","red");
		 return false;
	 }
}
 
 //비번 재입력 일치 확인
 //클릭하면 바로 텍스트 보여줌 활성화 하자
 $(document).ready(function(){
	   $('#pwdMatChk').focus(function(){
		   reCheckPwd();
	   });
	})
 function reCheckPwd() {
	 if($("#pwdMatChk").val() == '') {
		 $("#pwdMatChkRet").text("비밀번호를 재입력 해주세요");
		 $("#pwdMatChkRet").css("color","red");
	 } else if($("#pwd").val() !=$("#pwdMatChk").val() ) {
		 $("#pwdMatChkRet").text("비밀번호가 일치하지 않습니다.");
		 $("#pwdMatChkRet").css("color","red");

	 } else {
		 $("#pwdMatChkRet").text("비밀번호가 일치합니다.");
		 $("#pwdMatChkRet").css("color","green");
	 }

}


//-----------------------------------------------------------------

//Email 중복체크 및 정규식 실행문 
function chcekEmail(){
	var regExEmailResult = regExEmail();

	if(regExEmailResult == true ) {
		var emailDupChk = $("#emailDupChk").val();

		$.ajax({
			
			url : '/poom/register/emailDupChk',
			data : {
				id : emailDupChk
			},
				dataType : 'text',
				method : 'post',
				success : function(data) {
					console.log("에이작스 성공  들어옴");

				if ( data == 0 ){
					console.log("데이터 0");
					$("emailDupChkRet").text('사용가능한 Email입니다.')
					$("emailDupChkRet").css('color','green')
				} else if( data == 1 ){
					console.log("데이터 1");
					$("emailDupChkRet").text('중복된 Email입니다.')
					$("emailDupChkRet").css('color','red')
				} else {
					$("#emailDupChkRet").text("관리자에게 문의하세요.");
				}	
			},
			error : function() {
				console.log("에이작스 에러 왜!!");
				//alert("emailDupChk ajax 에러")
			}
	});
	}
}


//클릭하면 바로 텍스트 보여줌 활성화 하자
$(document).ready(function(){
	   $('#emailDupChk').focus(function(){
		   regExEmail();
	   });
})
 
 function regExEmail(){
	//이메일 유효성 검사(정규식)
	if($("#emailDupChk").val() ==''){
		console.log("정규식 시험 1")
	   $("#emailDupChkRet").text("Email를 입력해주세요.");
	   $("#emailDupChkRet").css("color","red");
	} else if (emailR.test( $("#emailDupChk").val() ) != true){
		console.log("정규식 시험 2")
		$("#emailDupChkRet").text("이메일 양식에 맞춰서 확인해주세요.")
		$("#emailDupChkRet").css("color","red")
		return false;
	} else {
		return true;
		console.log("정규식 시험 3확인")
	}
	
}


//-----------------------------------------------------------------
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }

//-----------------------------------------------------------------

</script>
  
</head>
<jsp:include page="../include/header.jsp"></jsp:include>
	
	<form action="com" method="post">
		<fieldset style="width:725px;margin-right:1000px">
			<legend style="font-size:25px;"><b>회원 입력</b></legend>
				<label><b>아이디 (자동 중복체크) :</b></label>
					<input type="text" name="id" id="idDupChk"  placeholder="ID" oninput="checkId()">
					<div class="validation" id="idDupChkRet" style="font-size: 15px;"></div>
<!-- 					<input type="hidden" id="idDupChkRet" style="width:270px;margin-right:1px"><br> -->
				<label><b>비밀번호 : </b></label>
					<input type="password" id="pwd" placeholder="PASSWORD"  oninput="checkPwd()">
					 <div class="validation" id="pwdRet" style="font-size: 15px;"></div>
				<label><b>비밀번호 재확인 : </b></label>
					<input type="password" name="pwd" id="pwdMatChk" placeholder="Confirm Password" oninput="reCheckPwd()">
					<div class="validation" id="pwdMatChkRet" style="font-size: 15px;"></div>
<!-- 					<input type="hidden" id="pwdMatChkRet"><br> -->
				<label><b>email(자동 중복체크) : </b></label>
					<input type="text" name='email' id="emailDupChk" placeholder="E-mail" oninput="chcekEmail()">
					<div class="validation" id="emailDupChkRet" style="font-size: 15px;"></div>										
<!-- 					<input type="hidden" id="emailDupChkRet"><br> -->
				
		</fieldset>
		<fieldset style="width:700px;margin-right:1000px">	
			<legend style="font-size:25px;"><b>사업자 정보 등록</b></legend>
				<label><b>매장명 : </b></label> 
					<input type="text" name="name" placeholder="매장명"><br>
				<label><b>사업자 번호 : </b></label>
					<input type="text" name="brn"  placeholder="사업자 번호"><br>
	
				<label><b>주소</b></label>
            		<input type="text" id="sample6_postcode" placeholder="우편번호" name="zipCode" style="width:60px;margin-right:1px">
           			<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
            		<input type="text" id="sample6_address" placeholder="주소" name="firstAddr"><br>
            		<input type="text" id="sample6_extraAddress" placeholder="참고항목" name="extraAddr">
            		<input type="text" id="sample6_detailAddress" placeholder="상세주소 미기입 가능" name="secondAddr"><br>
            	<label><b>전화번호 : </b></label> 
            		<input type="tel" name="tel" placeholder="전화번호 입력"><br>
	
				<label><b>매장 사이트 낫널 : </b></label>
					<input type="text" name='url_c' placeholder="매장 사이트 입력"><br>
	
				<label><b>매장 소개멘트 : <br><textarea rows="5" cols="100" name="ment"></textarea></b></label>
<!-- 				<input type='text' name='ment'><br> -->
	
	
<!-- 	프로필 사진 낫널아직: <input type="file" name='prof'><br> -->
	
<!-- 	사업자등록증 사진 : <input type="image" name='brn_img'><br> -->
	
<!-- 	사업자등록증 사진파일 : <input type="file" name=''><br> -->

	
	<div><input type='submit' value='추가'>
	<input type='reset' value='취소'>
	<input type='button' onclick='location.href="/poom"' value='리스트로'>
	</div>
	
	
	
	</fieldset>
	</form>

<jsp:include page="../include/footer.jsp"></jsp:include>