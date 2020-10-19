<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 회원가입</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<!-- 카카오 로그인 -->
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script type="text/javascript">
$().ready(function() {
	// SDK를 초기화 합니다. 사용할 앱의 JavaScript 키를 설정해 주세요.
	Kakao.init('ef974df3af8acda7ed3f3983cb387a81');
	// SDK 초기화 여부를 판단합니다.
	console.log(Kakao.isInitialized());

	// 사용자 정보 요청
// 	function getInfoKakao() {
		console.log('getInfoKakao() 실행');
		Kakao.API.request({
			url: '/v2/user/me',
			success: function(res) {
 				//alert( JSON.stringify(res) );
 				// 사용자 닉네임
 				var name = res.kakao_account.profile.nickname;
 				// 사용자 이메일
 				var email = res.kakao_account.email;
 				// 사용자 프로필 사진
 				var profUrl = res.kakao_account.profile.profile_image_url;
				$('#getInfo').append("<tr><td>닉네임 : " + name + "</td></tr>");
				$('#getInfo').append("<tr><td>이메일 : " + email + "</td></tr>");
				$('#getInfo').append("<tr><td>프로필 주소 : " + profUrl + "</td></tr>");
 				$('#name').setAttribute("value", name);
 				$('#emailDupChk').setAttribute("value", email);
 				$('#profUrl').setAttribute("value", profUrl);
 				
// 				$("#getInfo").html(JSON.stringify(res));
// 				$.each( res, function( k1, v1 ) {
//  	                 var totalKey = k1;
//  	                 var totalVal = v1;
// 	                 // kakao_account 안에 있는 정보만 가져올거야 -> profile_url이랑 email, nickname을 가져올거야
// 	                 if ( totalKey==="kakao_account" ) {
// 						$.each(totalVal, function(k2, v2) {
//  							var propKey = k2;
//  							var propVal = v2;
//  							// profile 안에 있는 정보를 가져올거야 -> profile_url 가져올거야
// 							if ( propKey==="profile" ) {
// 								$.each(propVal, function(k3, v3) {
//  									var profKey = k3;
//  									var profVal = v3;
// 									$('#getInfo').append("<tr><td>" + profKey + "</td></tr>");
// 									$('#getInfo').append("<tr><td>" + profVal + "</td></tr>");
// 								})
// 							} else if ( propKey==="email") {
// 								$('#getInfo').append("<tr><td>" + propKey + "</td></tr>");
// 								$('#getInfo').append("<tr><td>" + propVal + "</td></tr>");
// 							} else if ( propKey==="nickname") {
// 								$('#getInfo').append("<tr><td>" + propKey + "</td></tr>");
// 								$('#getInfo').append("<tr><td>" + propVal + "</td></tr>");
// 							}
// 						})
// 		             }
// 	            })
			},
			fail: function(error) {
				alert( 'login success, but failed to request user information: ' + JSON.stringify(error) );
			},
		})
// 	}
// 	function getInfoKakao() {
// 		console.log('getInfoKakao() 실행');
// 		Kakao.API.request({
// 			url: '/v2/user/me',
// 			success: function(response) {
// 				console.log(response);
// 			},
// 			fail: function(error) {
// 				console.log(error);
// 			}
// 		});
// 	}

	// 사용자 정보 저장
	function setInfoKakao() {
		console.log('setInfoKakao() 실행');
		Kakao.API.request({
		    url: '/v1/user/update_profile',
		    data: {
		        properties: {
		            mno : '김민희'
		        },
		    },
		    success: function(res) {
		        console.log("setInfo res =" + JSON.stringify(res));
		    },
		    fail: function(error) {
		        console.log( 'login success, but failed to request user information: ' + JSON.stringify(error) );
		    }
		});
	}
})
</script>
<script>

// 유효성 기능 활성화
$().ready(function(){

	// 아이디 유효성
	$('#idDupChk').focus(function() {
		regExId();
	});

	// 비밀번호 유효성
	$('#pwd').focus(function() {
		regExPwd();
	});

	// 이메일 유효성
	$('#emailDupChk').focus(function(){
		regExEmail();
	});

	// 연락처 유효성
	$('#tel').focus(function() {
		regExPwd();
	});
	
});


//----------------------[ 정규식 ]----------------------

//아이디 : 영소문자로 시작하는 6~12자의 영소문자 또는 숫자
var idR = /^[a-z]+[a-z0-9]{5,11}$/;
//비밀번호 : 8~15자의 영대문자 또는 영소문자, 숫자, 특수문자(#?!@$%^&*-)
var pwdR = /^(?=.*?[A-Za-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,15}$/;
// * 특수문자 ()도 가능하다고 뜸...
//이메일 : https://blog.managr.us/entry/email-%EA%B2%80%EC%A6%9D-%EC%A0%95%EA%B7%9C%EC%8B%9D%EA%B3%BC-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EB%B0%A9%EB%B2%95
var emailR = /^[A-Za-z0-9][A-Za-z0-9\_\-\.\+]+[0-9a-zA-Z]@[A-Za-z0-9][A-Za-z0-9\_\-]*[A-Za-z0-9]\.[A-Za-z]{2,6}$/;
// * 안됨
//var emailR = /^[a-zA-Z0-9._-]+@[a-zA-z0-9.-]+\.[a-zA-Z]{2,4}$/
//연락처 : '-'없이 번호만 입력해주세요
var telR=/^\d{2,3}-\d{3,4}-\d{4}$/;


//-----------------[ 아이디 function ]-----------------

// 유효성 검사 (정규식)
function regExId(){
	var idDupChk = $('#idDupChk').val(); 
	if ( idDupChk=='' ){	// 아이디 미입력
		$('#idDupChkRet').text('아이디를 입력해주세요.');
		$('#idDupChkRet').css('color', 'red');
	} else if( idR.test(idDupChk)!=true ){	// 유효성 검사 실패
		$('#idDupChkRet').text('6~12자의 영소문자 또는 숫자만 사용 가능하며, 영소문자로 시작해야 합니다.');
		$('#idDupChkRet').css('color', 'red');
		return false;
	} else {	// 유효성 검사 통과
		return true;
	}
}

// 중복 체크
function checkId(){
	var regExIdResult = regExId();	// 유효성 검사 실행
	//alert('regExIdResult = ' + regExIdResult);
	
	if ( regExIdResult==true ) {	// 유효성 검사 통과
		//alert("유효성 검사 통과함")
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
				if ( data==0 ) {
					//alert ("중복되지 않은 아이디");
					$('#idDupChkRet').text('사용가능한 아이디입니다.');
					$('#idDupChkRet').css('color', 'green');
				} else if ( data==1 ) {
					//alert("중복된 아이디")
					$('#idDupChkRet').text('이미 사용중인 아이디입니다.');
					$('#idDupChkRet').css('color', 'red');
				} else {
					//alert("에러");
					$('#idDupChkRet').text('관리자에게 문의하세요.');
					$('#idDupChkRet').css('color', 'red');
				}
			},
			error : function() {
				alert('idDupChk ajax 에러')
			}
		});
	}
	// 유효성 검사가 실패했을때, 회원가입 버튼이 안 눌리게 하는 조건 추가해야됨!
	
}


//----------------[ 비밀번호 function ]----------------

// 유효성 검사 (정규식)
function regExPwd(){
	var pwd = $('#pwd').val(); 
	if ( pwd=='' ){	// 비밀번호 미입력
		$('#pwdRet').text('비밀번호를 입력해주세요.');
		$('#pwdRet').css('color', 'red');
	} else if( pwdR.test(pwd)!=true ){	// 유효성 검사 실패
		$('#pwdRet').text('8~15자의 영대문자 또는 영소문자, 숫자, 특수문자(#?!@$%^&*-)를 혼합해서 사용해야 합니다.');
		$('#pwdRet').css('color', 'red');
		return false;
	} else {	// 유효성 검사 통과
		$('#pwdRet').text('사용가능한 비밀번호입니다.');
		$('#pwdRet').css('color', 'green');
		return true;
	}
}


// 일치 확인
function reCheckPwd() {
	var pwd = $('#pwd').val();
	var pwdMatChk = $('#pwdMatChk').val();
	//alert("pwd = " + pwd);
	//alert("pwdMatChk = " + pwdMatChk);
	
	if ( pwd==pwdMatChk ) {
		//alert("비밀번호 일치");
		$('#pwdMatChkRet').text('비밀번호가 일치합니다.');
		$('#pwdMatChkRet').css('color', 'green');
	} else {
		//alert("비밀번호 불일치");
		$('#pwdMatChkRet').text('비밀번호가 일치하지 않습니다.');
		$('#pwdMatChkRet').css('color', 'red');
	}
	
}


//-----------------[ 이메일 function ]-----------------

//유효성 검사 (정규식)
function regExEmail(){
	var emailDupChk = $('#emailDupChk').val(); 
	if ( emailDupChk=='' ){	// 이메일 미입력
		$('#emailDupChkRet').text('이메일을 입력해주세요.');
		$('#emailDupChkRet').css('color', 'red');
	} else if( emailR.test(emailDupChk)!=true ){	// 유효성 검사 실패
		$('#emailDupChkRet').text('이메일 양식에 맞춰서 입력해주세요. 예시) abc123@poom.com');
		$('#emailDupChkRet').css('color', 'red');
		return false;
	} else {	// 유효성 검사 통과
		return true;
	}
}

//중복 체크
function checkEmail(){
	var regExEmailResult = regExEmail();	// 유효성 검사 실행
	//alert('regExEmailResult = ' + regExEmailResult);
	
	if ( regExEmailResult==true ) {	// 유효성 검사 통과
		//alert("유효성 검사 통과함")
		var emailDupChk = $('#emailDupChk').val();
		//alert ("emailDupChk = " + emailDupChk);

		$.ajax({
			url : '/poom/register/emailDupChk',
			data : {
				email : emailDupChk
			},
			dataType : 'text' , // html, text, json, xml, script
			method : 'post',
			success : function(data) {
				//alert("emailDupChk ajax 성공");
				if ( data==0 ) {
					//alert ("중복되지 않은 이메일");
					$('#emailDupChkRet').text('사용가능한 이메일입니다.');
					$('#emailDupChkRet').css('color', 'green');
				} else if ( data==1 ) {
					//alert("중복된 이메일")
					$('#emailDupChkRet').text('이미 등록된 이메일입니다.');
					$('#emailDupChkRet').css('color', 'red');
				} else {
					//alert("에러");
					$('#emailDupChkRet').text('관리자에게 문의하세요.');
					$('#emailDupChkRet').css('color', 'red');
				}
			},
			error : function() {
				alert('emailDupChk ajax 에러')
			}
		});
	}
	// 유효성 검사가 실패했을때, 회원가입 버튼이 안 눌리게 하는 조건 추가해야됨!
	
}


//-----------------[ 연락처 function ]-----------------

// 유효성 검사 (정규식)
function regExTel(){
	var tel = $('#tel').val(); 
	if ( tel=='' ){	// 연락처 미입력
		$('#telRet').text('연락처를 입력해주세요.');
		$('#telRet').css('color', 'red');
	} else if( telR.test(tel)!=true ){	// 유효성 검사 실패
		$('#telRet').text('\'-\'를 제외한 번호만 입력해주세요.');
		$('#telRet').css('color', 'red');
		return false;
	} else {	// 유효성 검사 통과
		return true;
	}
}


//------------------[ 주소 function ]------------------

function execDaumPostcode() {
	
	new daum.Postcode({
		
		oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

			// 각 주소의 노출 규칙에 따라 주소를 조합한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			var addr = ''; // 주소 변수
			var extraAddr = ''; // 참고항목 변수

			// 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			if ( data.userSelectedType==='R') {	// 사용자가 도로명 주소를 선택했을 경우
				addr = data.roadAddress;
			} else {	// 사용자가 지번 주소를 선택했을 경우(J)
				addr = data.jibunAddress;
			}

			// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
			if( data.userSelectedType === 'R' ){
				// 법정동명이 있을 경우 추가한다. (법정리는 제외)
				
				// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
				if( data.bname!=='' && /[동|로|가]$/g.test(data.bname) ){
					extraAddr += data.bname;
				}

				// 건물명이 있고, 공동주택일 경우 추가한다.
				if( data.buildingName!=='' && data.apartment==='Y' ){
					extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
				}
				
				// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
				if( extraAddr!=='' ){
					extraAddr = ' (' + extraAddr + ')';
				}
				
				// 조합된 참고항목을 해당 필드에 넣는다.
				document.getElementById("extraAddress").value = extraAddr;
              
			} else {
				document.getElementById("extraAddress").value = '';
			}

			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			document.getElementById('postcode').value = data.zonecode;
			document.getElementById('address').value = addr;
			// 커서를 상세주소 필드로 이동한다.
			document.getElementById("detailAddress").focus();
		}
	
	}).open();
	
}

</script>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>
<div id="getInfo"></div>
	<form action="/poom/register/new" method="post" id="registerNewForm" enctype="multipart/form-data">
		<fieldset style="width:725px; margin-right:1000px;">
			<legend style="font-size:25px;"><b>정보 입력</b></legend>
				<div><label><b>* 아이디 : </b></label>
					<input type="text" name="id" id="idDupChk" placeholder="아이디" oninput="checkId()">
					<div class="validation" id="idDupChkRet" style="font-size: 15px;"></div></div>
				<div><label><b>* 비밀번호 : </b></label>
					<input type="password" id="pwd" placeholder="비밀번호" oninput="checkPwd()">
					 <div class="validation" id="pwdRet" style="font-size: 15px;"></div></div>
				<div><label><b>* 비밀번호 확인 : </b></label>
					<input type="password" name="pwd" id="pwdMatChk" placeholder="비밀번호 재입력" oninput="reCheckPwd()">
					<div class="validation" id="pwdMatChkRet" style="font-size: 15px;"></div></div>
				<div><label><b>* 이메일 : </b></label>
					<input type="email" name='email' id="emailDupChk" oninput="chcekEmail()">
					<div class="validation" id="emailDupChkRet" style="font-size: 15px;"></div></div>
				<div><label><b>* 이름 : </b></label>
					<input type="text" name='name' id="name"></div>
				<div><label><b>* 연락처 : </b></label>
					<input type="tel" name='tel' id='tel' placeholder="연락처">
					<div class="validation" id="telRet" style="font-size: 15px;"></div></div>
				<div><label><b>* 주소 : </b></label>
            		<input type="text" id="postcode" placeholder="우편번호" name="zipCode" style="width:60px; margin-right:1px;">
           			<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br />
            		<input type="text" id="address" placeholder="주소" name="firstAddr">
            		<input type="text" id="extraAddress" placeholder="참고항목" name="extraAddr"><br />
            		<input type="text" id="detailAddress" placeholder="상세주소" name="secondAddr"></div>
				<div><label><b>프로필 사진 : </b></label>
					<input type="text" id="profUrl"></div>
				<div><label><b>한 줄 소개 : </b></label>
					<textarea rows="3" cols="100" name="ment"  placeholder="한 줄 소개"></textarea></div>
				<div><label><b>관심 동물 : </b></label>
					<select form="registerNewForm" name="fav">
        				<option value="0">선택안함</option>
        				<option value="1">강아지</option>
        				<option value="2">고양이</option>
        				<option value="3">물고기</option>
        				<option value="4">새</option>
        				<option value="5">기타</option>
   					</select></div>
   				<div><label><b>애완동물 유무 : </b></label>
   					<select form="registerNewForm" name="pet">
        				<option value="0">선택안함</option>
        				<option value="1">있음</option>
        				<option value="2">없음</option>
   					</select></div>
				<div>
					<input type='reset' value='초기화'>
					<input type='submit' value='회원가입'>
				</div>				
		</fieldset>
	</form>
	<br />
	<div><input type='button' onclick='location.href="/poom"' value='리스트로'></div>

<jsp:include page="../include/footer.jsp"></jsp:include>