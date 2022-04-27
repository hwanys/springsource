<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Basic</h1>
<div>
<!-- 
	경로를 시작할 때 / 로 시작한다는 의미는
	http://localhost:9090/ 뒤에서 주소를 붙여나감
	
	/ 없이 시작하면 현재 주소에서 뒷부분만 변경한다는 의미
	
	현재 주소  http://localhost:9090/sample/basic
	(basic일때)
	doA만 넣으면 현재주소에서 뒷부분만 변경(sample 뒤).
	
	http://localhost:9090/sample/doA
 -->

	<p>${page}</p>
	<!-- 모든 요청은 컨트롤러로 가야 함 -->
	<p><a href="/">home</a></p>
	<p><a href="doA">doA</a></p>		<!-- /sample/doA, doA 둘 다 가능 -->
	<p><a href="login">login</a></p>	<!-- /sample/login, login 둘 다 가능 -->
	<p><a href="insert">insert</a></p>	<!-- /sample/insert, insert 둘 다 가능 -->
</div>
</body>
</html>