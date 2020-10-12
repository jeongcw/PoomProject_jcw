<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rehome List</title>

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
          &nbsp;&nbsp;&nbsp;<a href="add">등록</a>
          
          </p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">

            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" border="1">
                  <thead>
                    <tr>
                      <th>카테고리</th>
                      <th>분양 카테고리</th>
                      <th>게시글 번호</th>
                      <th>분양글 번호</th>
                      <th>제목</th>
                      <th>작성자</th>
                      <th>사진1</th>
                      <th>성별</th>
                      <th>나이</th>
                      <th>분양가</th>                 
                      <th>조회수</th>
                      <th>관심수</th>
                      <th>작성일</th>
                      <th>수정일</th>
                      <th>수정</th>
                      <th>삭제</th>
                      
                    </tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${rehomeList}" var="rehomeList">
                    <tr>
                      <td><c:out value="${rehomeList.type_b }" /></td>
                       <td><c:choose>
                          <c:when test="${rehomeList.cat_r eq '0' }">개</c:when>
                          <c:when test="${rehomeList.cat_r eq '1' }">고양이</c:when></c:choose> </td>
                        <td><c:out value="${rehomeList.bno }" /></td>
                      <td><c:out value="${rehomeList.rno }" /></td>
                       <td><c:out value="${rehomeList.title }" /></td>
                      <td><c:out value="${rehomeList.id_writer }" /></td>
                      <td><c:out value="${rehomeList.img_r1 }" /></td>
                      <td><c:out value="${rehomeList.gender }" /></td>
                      <td><c:out value="${rehomeList.age }" /></td>
                      <td><c:out value="${rehomeList.cost }" /></td>                     
                      <td><c:out value="${rehomeList.viewcnt }" /></td>
                      <td><c:out value="${rehomeList.likecnt }" /></td>                      
                      <td><fmt:formatDate pattern="yyyy-MM-dd" value="${rehomeList.cre_date_b }" /></td>
                      <td><fmt:formatDate pattern="yyyy-MM-dd" value="${rehomeList.mod_date_b }" /></td>
                      <td><a href='update?bno=<c:out value="${rehomeList.bno}" />' ><c:out value="수정" /></a></td>
                      <td><a href='delete?bno=<c:out value="${rehomeList.bno}" />' ><c:out value="삭제" /></a></td>
                       <td><a href="#" onClick="window.open('report?bno=<c:out value="${rehomeList.bno}"  />','window_name','width=430,height=500,location=no,status=no,scrollbars=yes');"><c:out value="신고" /></a></td>
                       
                    </tr>
                    <!-- <script language="javascript">
  function popup() { window.open("report", "a", "width=400, height=300, left=100, top=50"); }
  </script> -->
                    </c:forEach>
                  </tbody>
                </table>
               
               
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

<jsp:include page="../include/footer.jsp"></jsp:include>