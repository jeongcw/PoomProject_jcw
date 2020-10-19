<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome Read</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>
</head>
<jsp:include page="../include/header.jsp"></jsp:include>

    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
            <h1 class="h3 mb-2 text-gray-800">FAQ</h1>
          <p class="mb-4">게시물 리스트
          &nbsp;&nbsp;&nbsp;
          <section class="jumbotron text-center"
			style='background-color: #151515;'>
			<div class="container">
				<h1>
					<font color='white'>POOM</font>
				</h1>
				<p class="lead text-muted">
					<font color='white'>구현중</font>
				</p>
				      <p>
				       <a href="add">신규 등록</a>
				      </p>
			</div>
		</section>

          </p>
          <!-- DataTales Example -->
          <div class="card shadow mb-4">

            <div class="card-body">
              <div class="table-responsive" align="center">




						<div rows="50" cols="150">
							<div>게시판 번호: ${rehomeRead.bno}</div>
							<div>작성자: ${rehomeRead.id_writer}</div>
							<div>제목: ${rehomeRead.title}</div>
							<div>등록된 사진: <img src="/resources/img/rehome/${rehomeRead.img_r1 }" onerror="this.style.display='none'" width="200" height="200" /></div>
							<div>종 분류: ${rehomeRead.cateName}</div>
							<div>나이: ${rehomeRead.age}</div>
							<div>분양가: ${rehomeRead.cost}</div>
							<div>본문: ${rehomeRead.cont_b}</div>
							<div><button type="button" onclick="location.href='pay'">분양받기</button></div>
							<div><a href="#" onClick="window.open('report?bno=${rehomeRead.bno}','window_name','width=430,height=500,location=no,status=no,scrollbars=yes');">신고</a></div>							
							<div><a href='update?bno=${rehomeRead.bno}'>수정</a></div>
							<div><a href='delete?bno=${rehomeRead.bno}'>삭제</a></div>
						</div>
   
   


              
              
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

<jsp:include page="../include/footer.jsp"></jsp:include>