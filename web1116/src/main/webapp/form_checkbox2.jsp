<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function check() {
			var chk=0;
			
			for(var i=0;i<6;i++) {
				if(document.pkc.food[i].checked) {
					chk++;
				}
			}
			
			if(chk==0) {
				alert("체크를 하세요");
			}
			else if(chk<2) {
				alert("2개이상 선택하세요")
			}
			else if(chk>3) {
				alert("3개까지만 선택하세요")
			} else {
				alert("체크완료")
			}
		}
	</script>
</head>
<body>
	<form name="pkc">
		<input type="checkbox" name="food">피자<p>
		<input type="checkbox" name="food">초밥<p>
		<input type="checkbox" name="food">족발<p>
		<input type="checkbox" name="food">알탕<p>
		<input type="checkbox" name="food">햄버거<p>
		<input type="checkbox" name="food">짜장면<p>
		
		<input type="button" value="선택완료" onclick="check()">
	</form>

</body>
</html>