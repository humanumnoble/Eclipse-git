<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function fun1() {
			alert("클릭");	
		}
		function fun2() {
			alert("마우스오버");	
		}
		function fun3() {
			alert("마우스아웃");	
		}
		function fun4() {
			alert("커서");	
		}
		
	</script>
</head>
<body>
	<div onclick="fun1()">클릭하면 함수 호출</div><p>
	<div onmouseover="fun2()">마우스오버 되면 함수 호출</div><p>
	<div onmouseout="fun3()">마우스가 out되면 함수 호출</div><p>
	<input type="text" placeholder="커서가 들어오면 함수호출" onfocus="fun4()">

</body>
</html>