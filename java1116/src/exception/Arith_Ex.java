package exception;

public class Arith_Ex {
	public static void main(String[] args) {
		// Exception : 예외
		// 예외처리 -> 잘몬된 값이 동작으로 인해 발생될 에러를 처리하는 방법

		int num1 = 50;
		int num2 = 0;

		if (num2 != 0) { // 에러처리를 위한 부분
			int result = num1 / num2;
			System.out.println(result);
		} else {
			System.out.println("0으로는 못나눕니다.");
		}
	}
}
