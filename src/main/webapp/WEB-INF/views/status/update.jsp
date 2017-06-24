<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title }</title>
<link href='<c:url value="/resources/css/bootstrap.css"></c:url>' rel="stylesheet">
</head>
<body>
	<div class="container">
	  <div class="container-fluid">
	    <div class="col-lg-8 col-lg-offset-2">
	      <div class="page-header">
	        <h3>${msg }</h3>
	      </div>
	      <form action="${pageContext.request.contextPath}/edit" method="POST" class="form-horizontal">
	        <div class="form-group">
	          <label class="col-lg-3 control-label">idstatus :</label>
	          <div class="col-lg-5">
	            <input type="text" class="form-control" name="idstatus" value="${get.idstatus}" readonly="readonly">
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="col-lg-3 control-label">nama :</label>
	          <div class="col-lg-5">
	            <input type="text" class="form-control" name="nama" value="${get.nama}">
	          </div>
	        </div>
	        <div class="col-lg-4 col-lg-offset-4">
	          <button type="submit" class="btn btn-success">
	            <span class="glyphicon glyphicon-save"></span>
	            update
	          </button>
	          <a href="${pageContext.request.contextPath}/" class="btn btn-default">
	            <span class="glyphicon glyphicon-circle-arrow-right"></span>
	            kembali
	          </a>
	        </div>
	      </form>
	    </div>
	  </div>
	</div>
</body>
</html>