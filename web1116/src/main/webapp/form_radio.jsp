<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	// radio버튼이 체크가 되었느냐? 어떤게 선택된것은 중요하지 않다. => 하나는 선택되어야 한다..
	// radio는 선택여부확인 선택이 안되었을때 메시지를 보낸다   		
	function check() {
		// radio의 checked속성을 이용한다.. radio가 체크되면 checked속성은 true 
		var chk = 0;

		if (document.pkc.munje[0].checked) { // if문에는 비교연산자를 이용해서 true,false
			chk = 1;
		}

		if (document.pkc.munje[1].checked) {
			chk = 1;
		}

		if (document.pkc.munje[2].checked) {
			chk = 1;
		}

		if (document.pkc.munje[3].checked) {
			chk = 1;
		}

		if (chk == 0) {
			alert("체크를 하세요");
		} else {
			alert("정답제출완료");
		}
	}
</script>
</head>
<body>
	<!-- radio는 주로 여러개중에 하나를 선택하는 것으로  => 선택을 하였느냐? -->
	<!-- radio는 name이 같은 것끼리 하나만 선택 -->
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