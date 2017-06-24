<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title }</title>
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidator.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidatori.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/datatables.css"/>" rel="stylesheet">
<link href="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css"/>">
<script src="<c:url value="/resources/js/datatables.js"/>" ></script>
<script src="<c:url value="//code.jquery.com/jquery-1.12.4.js"/>"></script>
<script src="<c:url value="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"/>"></script>
<script scr="<c:url value="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrapValidator.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrapValidator.min.js"/>"></script>
<script type="text/javascript">
  function goToPageNasabah(){
	  window.location.href="/nasabah";
  }
</script>
<script type="text/javascript">
  function cariStatus(){
	$("#tampilkan").modal('show');  
  }
</script>

<script type="text/javascript">
  $(document).on('click', '.pilih', function(){
	 document.getElementById("idstatus").value=$(this).attr("data-idstatus");
	 document.getElementById("namastatus").value=$(this).attr("data-namastatus");
	 $("#tampilkan").modal('hide');
  });
</script>
</head>
<body>
  <div class="container">
    <div class="container-fluid">
      <div class="col-lg-8 col-lg-offset-2">
        <div class="page-header">
          <h3>${msg }</h3>
        </div>
        <form action="${pageContext.request.contextPath}/updateNasabah" method="POST" class="form-horizontal">
          <div class="form-group">
            <label class="col-lg-3 control-label">idnasabah :</label>
            <div class="col-lg-5">
              <input type="text" class="form-control" name="idnasabah" value="${gets.idnasabah}" readonly="readonly">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">nama :</label>
            <div class="col-lg-5">
              <input type="text" class="form-control" name="nama" value="${gets.nama}">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">status :</label>
            <div class="col-lg-5">
              <input type="text" class="form-control" id="idstatus" name="idstatus" value="${gets.status.idstatus}" readonly="readonly">
              <input type="text" class="form-control" id="namastatus" name="namastatus" value="${gets.status.nama}" readonly="readonly">
            </div>
            <button type="button" class="btn btn-default" onclick="cariStatus()">
                <span class="glyphicon glyphicon-search"></span>
                cari
              </button>
          </div>
          <div class="form-group">
           <label class="col-lg-3 control-label">telepon :</label>
           <div class="col-lg-5">
             <input type="text" class="form-control" name="notelp" value="${gets.notelp}">
           </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">alamat :</label>
            <div class="col-lg-5">
              <input type="text" class="form-control" name="alamat" value="${gets.alamat}">
            </div>
          </div>
          <div class="col-lg-4 col-lg-offset-4">
            <button type="submit" class="btn btn-success">
              <span class="glyphicon glyphicon-save"></span>
              save
            </button>
            <button type="button" class="btn btn-default" onclick="goToPageNasabah()">
              <span class="glyphicon glyphicon-circle-arrow-right"></span>
              back
            </button>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!-- modal status -->
  <div class="modal fade" id="tampilkan" tabindex="-1" aria-hidden="true">
     <div class="modal-dialog" role="dialog">
       <div class="modal-content" role="document">
         <div class="modal-header">
           <button type="button" class="close" data-dismiss="modal">
             <span aria-hidden="true">close</span>
           </button>
           <br/>
           <h3 class="alert alert-info">cari status</h3>
         </div>
         <div class="modal-body">
           <table class="table table-bordered table-condensed table-stripped table-hover">
             <thead>
               <tr>
                 <th>idstatus</th>
                 <th>nama</th>
               </tr>
             </thead>
               <tbody>
                 <c:forEach items="${listStatus}" var="status">
                   <tr class="pilih"
                   data-idstatus="${status.idstatus}"
                   data-namastatus="${status.nama}">
                   
                   <td><c:out value="${status.idstatus}"></c:out></td>
                   <td><c:out value="${status.nama}"></c:out></td>
                   </tr>
                  </c:forEach>
               </tbody>
             <tfoot>
               <tr>
                 <th>idstatus</th>
                 <th>nama</th>
               </tr>
             </tfoot>
           </table>
         </div>
       </div>
     </div>
  </div>
</body>
</html>