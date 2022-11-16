package exception;

public class Arith_Exception {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 0;
		
		
		try {		//try 영역 : 에러가 발생되면
			int result=num1/num2;
			System.out.println(result);
		} 
		
		catch(ArithmeticException e) {	//catch 영역 : 에러 발생시 여기를 실행
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("0으로는 안되요");
		}
		System.out.println("다음 문장 1");
		System.out.println("다음 문장 2");
	}
}
