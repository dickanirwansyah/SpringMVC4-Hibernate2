<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>${title }</title>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet"/>
        <link href="<c:url value="/resources/css/datatables-bootstrap.css" />" rel="stylesheet"/>
        <link href="<c:url value="/resources/css/datatables.css"/>" rel="stylesheet"/>
        <link href="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>">
        <link href="<c:url value="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css"/>">
        <script src="<c:url value="/resources/js/datatables.js"/>" ></script>
        <script src="<c:url value="//code.jquery.com/jquery-1.12.4.js"/>"></script>
        <script src="<c:url value="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"/>"></script>
        <script scr="<c:url value="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrapValidator.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrapValidator.min.js"/>"></script>
	<script type="text/javascript">
	  $(document).ready(function(){
		 $('#tabel-nasabah').DataTable(); 
	  });
	</script>
	<script type="text/javascript">
	  function goToPageInsertForm(){
		  window.location.href="/insertNasabah";
	  }
	</script>
</head>
<body>
   	<div class="container">
   	  <div class="container-fluid">
   	    <div class="col-lg-8 col-lg-offset-2">
   	      <div class="page-header">
   	        <h3>Data Nasabah</h3>
   	      </div>
   	      <button type="button" class="btn btn-success" onclick="goToPageInsertForm()">
   	        <span class="glyphicon glyphicon-plus-sign"></span>
   	        Tambah data
   	      </button>
   	      <div class="page-header">
   	        <table class="table table-bordered table-condensed table-stripped" 
   	          id="tabel-nasabah">
   	           <thead>
   	             <tr>
   	               <th>idnasabah</th>
   	               <th>nama</th>
   	               <th>status</th>
   	               <th>telepon</th>
   	               <th>alamat</th>
   	               <th>opsi</th>
   	             </tr>
   	             <tbody>
   	               <c:forEach  items="${listnasabah}" var="nasabah">
   	                 <tr>
   	                   <td><c:out value="${nasabah.idnasabah}"/></td>
   	                   <td><c:out value="${nasabah.nama}"/></td>
   	                   <td><c:out value="${nasabah.status.nama}"/></td>
   	                   <td><c:out value="${nasabah.notelp}"/></td>
   	                   <td><c:out value="${nasabah.alamat}"/></td>
   	                   <td>
   	                     <a href="${pageContext.request.contextPath}/updateNasabah/${nasabah.idnasabah}" 
   	                       class="btn btn-success">
   	                       <span class="glyphicon glyphicon-pencil"></span>
   	                       update
   	                     </a>
   	                     <a href="${pageContext.request.contextPath}/deleteNasabah/${nasabah.idnasabah}"
   	                      class="btn btn-default" onclick="return confirm('yakin ingin hapus data ini?')">
   	                       <span class="glyphicon glyphicon-trash"></span>
   	                       delete
   	                     </a>
   	                   </td>
   	                 </tr>
   	               </c:forEach>
   	             </tbody>
   	           </thead>
   	           </tfoot>
   	              <tr>
   	                <th>idnasabah</th>
   	                <th>nama</th>
   	                <th>status</th>
   	                <th>telepon</th>
   	                <th>alamat</th>
   	                <th>opsi</th>
   	              </tr>
   	           </tfoot>
   	        </table>
   	      </div>
   	    </div>
   	  </div>
   	</div>
</body>
</html>