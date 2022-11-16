<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		function check() {
			var ch = 0;
			
			for(var i=0;i<5;i++) {
				if(document.pkc.chk[i].checked) {
					ch=1;}
				}
				
			if(ch==0) {
				alert("결제방법을 선택하세요"); 
			} 
			else { alert("결제완료");
			}
	}			
		
	</script>
</head>
<body>
	<form name="pkc">
		<input type="radio" name="chk">현금<p>
		<input type="radio" name="chk">외상<p>
		<input type="radio" name="chk">계좌이체<p>
		<input type="radio" name="chk">신용카드<p>
		<input type="radio" name="chk">간편페이<p>
		<input type="button" value="구입" onclick="check()">
	</form>

</body>
</html>