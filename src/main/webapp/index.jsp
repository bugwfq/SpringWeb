<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	body{padding: 0px;margin: 0px;}
#header{width: auto;min-height: 70px;line-height: 70px;}
#header{border-bottom: medium solid #39A631;}
span.title_con{font-family:"微软雅黑";font-style: normal;font-size: 2em;font-weight:800 ;color: #39A631;padding-left: 1em;}
#content{width: auto;height:28em;text-align: center;background-image: url(../img/hovertree_login_bg.jpg);background-size: 100% 100%;}
#footer{width: auto;min-height: 60px;line-height:60px;text-align:center;font-family:Arial, Helvetica, sans-serif}
#footer{border-top: thin solid #39A631;}#footer a{color:black;}
.con{width: 35%;height: 20em;margin-top:4em;min-width:260px;}
.con{border: thin solid #8EC172;}
.con_title{background-color: #8EC172;width: auto;height: 3.5em;line-height: 3.5em;text-align: center;min-width:260px;}
.con_title_sp{font-family: "微软雅黑";font-size: 1.5em;font-weight: 800;color: #FFF;}
.con_input{margin: 2em 0 1em 0;}
.submit-btn{width: 8em;height: 2em;background-color: #62ab00;border-radius: 4px;border: 0px;color: #fff;font-family:"微软雅黑";font-size: 1em;font-weight: bold;}
.con_input span{font-family: "微软雅黑";font-size: 1em;font-weight: bold;color: #333;}
.con_input input{width: 15em;padding: 0.5em 1em;border: 1px solid #bbb;}
.submit-btn{margin: 1em 0 1em 0;}
</style>
<title>易通软件教育</title><base target="_blank" />
</head>
<body>

<div id="header">
	<div class="header_title">
	<span class="title_con">老王新闻网</span>
	</div>
</div>

<div id="content">
<div class="con_title">
<span class="con_title_sp">今日头条</span>
</div>
<div class="con_input">
		<c:forEach var="news" items="${requestScope.list}">
		<a href="NewsContent?id=${news.nid}">${news.title}</a><br/>
		</c:forEach>
</div>
</div>

<div id="footer">
&copy; 加入我们：<a href="">联系客服</a>
</div>

</body>
</html>