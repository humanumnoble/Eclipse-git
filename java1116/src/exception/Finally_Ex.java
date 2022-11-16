package exception;

public class Finally_Ex {
	public static void main(String[] args) {
		int num1=50;
		int num2=3;
		
		try { 
			int result = num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("0은 안되요");
		}
		finally {	//예외가 발생하나 발생하지 않으나 무조건 실행
			//위의 try 문장과 관련이 있어서 
			System.out.println("여기는 finally입니다.");
		}
		
		System.out.println("문장1");
		System.out.println("문장2");
	}

}
