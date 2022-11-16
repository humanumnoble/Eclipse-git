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

	    	 for(var i=0;i<4;i++) {
	    		  if(document.pkc.munje[i].checked)	{
	    		 	chk=1; 
	    		 	}
	    	 }
			if(chk==0) {
		    	alert("체크를 하세요");
			} else {
	    		alert("정답제출완료");
	    	}	 
			
		}
	</script>
</head>
<body>
	<form name="pkc">
	1. 미국의 랜드마크는 무엇인가?
	<input type="radio" name="munje"> 시카고 피자<p>
	<input type="radio" name="munje"> 자유의 여신상<p>
	<input type="radio" name="munje"> 백악관<p>
	<input type="radio" name="munje"> NASA<p>
	<input type="button" onclick="check()" value="시험완료">
	</form>
</body>
</html>