<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	    .comment{
	      position:absolute;
	      left:0px;
	      top:0px;
	      z-index:-1;
	    }
	    
	    .comment1{
		    overflow:hidden;
		    background-color:#000;
		    margin:0 auto;
		    color:#fff;
		    border-radius:4px;
		    height:28px;
		    width:120px;
		    position:relative;
		    z-index:10;
	    }
	</style>
  </head>
  
  <body>
    <div class="">评论1</div>
    <div class="comment1">复制</div>
    <div class="comment">评论2</div>
    <div class="">评论3</div>
  </body>
</html>
