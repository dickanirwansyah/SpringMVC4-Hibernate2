<%-- 
    Document   : index
    Created on : Jun 21, 2017, 6:18:59 AM
    Author     : dickajava
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
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
        		$('#tabel-status').DataTable();
        	});
        </script>
        <script type="text/javascript">
           function goToPageInsert(){
        	   window.location.href="/insertStatus";
           }
        </script>
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>${msg}</h3>
                    </div>
                    <button type="button" class="btn btn-success" onclick="goToPageInsert()">
                        <span class="glyphicon glyphicon-plus-sign"></span>
                        Tambah Data
                    </button>
                    <div class="page-header">
                       <table class="table table-condensed table-bordered" id="tabel-status">
                       	 <thead>
                       	 <tr>
                       	    <th>idstatus</th>
                       	    <th>nama</th>
                       	    <th>opsi</th>
                       	 </tr>
                       	 <tbody>
                       	   <c:forEach items="${stats}" var="status">
                       	     <tr>
                       	       <td><c:out value="${status.idstatus}"></c:out></td>
                       	       <td><c:out value="${status.nama}"></c:out></td>
                       	       <td>
                       	         <a href="${pageContext.request.contextPath}/ambilStatus/${status.idstatus}" class="btn btn-success">
                       	           <span class="glyphicon glyphicon-pencil"></span>
                       	           update
                       	         </a>
                       	         <a href="${pageContext.request.contextPath}/deleteStatus/${status.idstatus}" 
                       	           onclick="return confirm('yakin ingin hapus data ini?')" class="btn btn-default">
                       	           <span class="glyphicon glyphicon-trash"></span>
                       	           delete
                       	         </a>
                       	       </td>
                       	     </tr>
                       	   </c:forEach>
                       	 </tbody>
                       	 </thead>
                       </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
