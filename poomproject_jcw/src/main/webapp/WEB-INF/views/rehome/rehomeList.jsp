<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome List</title>
<jsp:include page="../include/inHead.jsp"></jsp:include>

</head>
<jsp:include page="../include/header.jsp"></jsp:include>

    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->

          <p class="mb-4">
          <section class="jumbotron text-center" style='background-color: #151515;'>
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

<div class="album py-5 bg-light">
			<div class="container">

				<div class="row">					
					<c:forEach items="${rehomeList}" var="rehomeList">
						<div class="col-md-4">
							<div class="card mb-4 shadow-sm">
								<img src="/resources/img/rehome/${rehomeList.img_r1 }" onerror="this.style.display='none'" width="200" height="200" />
								
								<div class="card-body">
									<p class="card-text"><c:out value="${rehomeList.title}" />/<c:out value="${rehomeList.cateName}" />/<c:out value="${rehomeList.age}" />/<c:out value="${rehomeList.cost}" /> </p>
									<div class="d-flex justify-content-between align-items-center">
										<div class="btn-group">
											<button type="button" class="btn btn-sm btn-outline-secondary" onclick="location.href='read?bno=${rehomeList.bno}'">보기</button>
	
										</div>
										<small class="text-muted"><fmt:formatDate pattern="yyyy-MM-dd" value="${rehomeList.mod_date_b}" /></small>
									</div>
								</div>
							</div>
						</div>
                    <tr>

                    </c:forEach>
					
					
				</div>
			</div>
		</div>




<jsp:include page="../include/footer.jsp"></jsp:include>