<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	
		function movedown() {
			var b = document.chan;
			/* var a = document.pkc;
			
			var a1 = a.name.value;
			var a2 = a.age.value;
			var a3 = a.phone.value;
			var a4 = a.pwd.value;
			var a5 = a.sogae.value;

			b.name.value = a1;
			b.age.value = a2;
			b.phone.value = a3;
			b.pwd.value = a4;
			b.sogae.value = a5;
 			*/
 			
			var a1 = document.getElementsByName("name")[0].value;
			var a2 = document.getElementsByName("age")[0].value;
			var a3 = document.getElementsByName("phone")[0].value;
			var a4 = document.getElementsByName("pwd")[0].value;
			var a5 = document.getElementsByName("sogae")[0].value;
			
			document.getElementsByName("name")[1].value = a1;
			document.getElementsByName("age")[1].value =a2;
			document.getElementsByName("phone")[1].value =a3;
			document.getElementsByName("pwd")[1].value =a4;
			document.getElementsByName("sogae")[1].value =a5;
		}
		
		function moveup() {
			var a = document.pkc;
			var b = document.chan;
			
			var b1 = b.name.value;
			var b2 = b.age.value;
			var b3 = b.phone.value;
			var b4 = b.pwd.value;
			var b5 = b.sogae.value;
			
			a.name.value = b1;
			a.age.value = b2;
			a.phone.value = b3;
			a.pwd.value = b4;
			a.sogae.value = b5;
			
		}
		
	</script>
</head>
<body>
	<form name="pkc">
	이름 <input type="text" name="name"><p>
	나이 <input type="text" name="age"><p>
	전화 <input type="text" name="phone"><p>
	비번 <input type="password" name ="pwd"><p>
	소개 <textarea cols="30" rows="3" name="sogae"></textarea><p>
	<input type="button" value="아래의 폼으로 이동" onclick="movedown()">
	</form>
	<hr>
	<form name="chan">
	이름 <input type="text" name="name"><p>
	나이 <input type="text" name="age"><p>
	전화 <input type="text" name="phone"><p>
	비번 <input type="password" name ="pwd"><p>
	소개 <textarea cols="30" rows="3" name="sogae"></textarea><p>
	<input type="button" value="위의 폼으로 이동" onclick="moveup()">
	</form>
	<hr>
	
</body>
</html>