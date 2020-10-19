<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 회원가입</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<!-- 카카오 로그인 -->
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script type="text/javascript">
	// SDK를 초기화 합니다. 사용할 앱의 JavaScript 키를 설정해 주세요.
	Kakao.init('ef974df3af8acda7ed3f3983cb387a81');
	// SDK 초기화 여부를 판단합니다.
	console.log(Kakao.isInitialized());

	// 로그인
	function loginWithKakao() {
		console.log('loginWithKakao() 실행');
// 		Kakao.Auth.login({
// 			success: function(authObj) {
// 				alert(JSON.stringify(authObj));
// 			},
// 			fail: function(err) {
// 				alert(JSON.stringify(err));
// 			},
// 		})
		Kakao.Auth.authorize({
			redirectUri: 'http://localhost:9999/poom/login/kakao'
		})
	}
	// 아래는 데모를 위한 UI 코드입니다.
	getToken();
	function getToken() {
		console.log('getToken() 실행');
		const token = getCookie('authorize-access-token');
		if ( token ) {
			Kakao.Auth.setAccessToken(token);
			document.getElementById('token-result').innerText = 'login success. token: ' + Kakao.Auth.getAccessToken();
		}
	}
	function getCookie( name ) {
		console.log('getCookie() 실행');
		const value = "; " + document.cookie;
		const parts = value.split("; " + name + "=");
		if ( parts.length===2) return parts.pop().split(";").shift();
	}
	
	// 동적으로 로그인
// 	function loginWithKakao() {
// 		Kakao.Auth.login({
// 			success: function(authObj) {
// 				alert(JSON.stringify(authObj));
// 			},
// 			fail: function(err) {
// 				alert(JSON.stringify(err));
// 			},
// 		})
// 	}

	// 버튼 생성
	function createLoginButton() {
		console.log('createLoginButton() 실행');
		Kakao.Auth.createLoginButton({
			container: '#create-kakao-login-btn',
			success: function(authObj) {
				alert(JSON.stringify(authObj));
			},
			fail: function(err) {
				alert(JSON.stringify(err));
			},
		})
	}
	
	// 새 계정으로 로그인
	function loginFormWithKakao() {
		console.log('loginFormWithKakao() 실행');
		Kakao.Auth.loginForm({
			success: function(authObj) {
				showResult(JSON.stringify(authObj));
			},
			fail: function(err) {
 				showResult(JSON.stringify(err));
			},
		})
	}
	function showResult(result) {
		console.log('showResult() 실행');
		document.getElementById('login-form-result').innerText = result;
	}

	
	// 로그 아웃
	function kakaoLogout() {
		console.log('kakaoLogout() 실행');
		if (!Kakao.Auth.getAccessToken()) {
			alert('Not logged in.');
			return
		}
		Kakao.Auth.logout(function() {
			alert('logout ok\naccess token -> ' + Kakao.Auth.getAccessToken());
		})
	}
// 	function logoutWithKakao() {
// 		console.log('logoutWithKakao() 실행');
// 		if (!Kakao.Auth.getAccessToken()) {
// 			console.log('Not logged in.');
// 			return;
// 		} else {
// 			console.log('카카오 인증 액세스 토큰이 존재합니다.', Kakao.Auth.getAccessToken());
// 			Kakao.Auth.logout(function() {
// 				console.log('로그아웃 되었습니다', Kakao.Auth.getAccessToken());
// 			});
// 			this.setState({
// 				isLogin: false
// 			});
// 		}
// 	}

	// 연결 끊기
	function unlinkApp() {
		console.log('unlinkApp() 실행');
		Kakao.API.request({
			url: '/v1/user/unlink',
			success: function(res) {
				alert('success: ' + JSON.stringify(res));
			},
			fail: function(err) {
				alert('fail: ' + JSON.stringify(err));
			},
		})
	}
// 	function unlinkWithKakao() {
// 		console.log('unlinkWithKakao() 실행');
// 		Kakao.API.request({
// 			url: '/v1/user/unlink',
// 			success: function(response) {
// 				console.log(response);
// 			},
// 			fail: function(error) {
// 				console.log(error);
// 			},
// 		});
// 	}

	// 사용자 정보 요청
	function getInfoKakao() {
		console.log('getInfoKakao() 실행');
		Kakao.API.request({
			url: '/v2/user/me',
			success: function(res) {
 				//alert( JSON.stringify(res) );
 				// 사용자 닉네임
 				var name = res.kakao_account.profile.nickname;
 				// 사용자 이메일
 				var prof = res.kakao_account.email;
 				// 사용자 프로필 사진
 				var email = res.kakao_account.profile.profile_image_url;
 				$('#getInfo').append("<tr><td>닉네임 = " + name + "</td></tr>");
 				$('#getInfo').append("<tr><td>이메일 = " + email + "</td></tr>");
 				$('#getInfo').append("<tr><td>프로필 = " + prof + "</td></tr>");
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
	}
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
</script>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>

	
	<button type="button" onclick="location.href='new'">신규 등록하기</button>
	<br />
	<hr />
	<p>연동하기</p>
	<div class="kakao">
<!-- 	<button type="button" onclick="location.href='/member/kakao/kakao_login.php'">카카오톡</button> -->
		<div>
			<!-- 로그인 -->
			<a id="custom-login-btn" href="javascript:loginWithKakao()">
				<img src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg" width="222" />
			</a>
			<p id="token-result"></p>
			<!-- 동적으로 로그인 -->
	<!-- 		<a id="custom-login-btn" href="javascript:loginWithKakao()"> -->
	<!-- 			<img src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg" width="222" /> -->
	<!-- 		</a> -->
		</div>
<!-- 		<div> -->
<!-- 			<!-- 버튼 생성 --> -->
<!-- 			<button onclick="createLoginButton()">버튼 생성</button> -->
<!-- 			<a id="create-kakao-login-btn"></a> -->
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<!-- 새 계정으로 로그인 --> -->
<!-- 			<a id="login-form-btn" href="javascript:loginFormWithKakao()"> -->
<!-- 	  			<img src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg" width="222" /> -->
<!-- 			</a> -->
<!-- 			<p id="login-form-result"></p> -->
<!-- 		</div> -->
		<div>
			<!-- 로그아웃 -->
			<button class="api-btn" onclick="kakaoLogout()">로그아웃</button>
	<!-- 		<button onclick="logoutWithKakao()">로그아웃</button> -->
			<!-- 연결끊기 -->
			<button class="api-btn" onclick="unlinkApp()">앱 탈퇴하기</button>
	<!-- 		<button onclick="unlinkWithKakao()">연결끊기</button> -->
		</div>
<!-- 		<div> -->
<!-- 			<!-- 사용자 정보 요청 --> -->
<!-- 			<button onclick="getInfoKakao()">사용자정보 가져오기</button> -->
<!-- 			<div id="getInfo"></div> -->
<!-- 			<!-- 사용자 정보 저장 --> -->
<!-- 			<button onclick="setInfoKakao()">사용자정보 추가하기 (이름/tel)</button> -->
<!-- 			<a id="kakao-login-btn"></a> -->

<!-- 		</div> -->
	</div>
	<div class="naver"></div>
	<div class="google"></div>
	<div class="facebook"></div>
	
<jsp:include page="../include/footer.jsp"></jsp:include>