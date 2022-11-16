package exception;

public class Throws_Ex {
	public void test() throws ArithmeticException{
		//발생한 예외처리를 -> 호출한 메소드로 던진다
		int num1=100;
		int num2=0;
		
		int result=num1/num2;
		System.out.println("값 : "+result);
	}
	
	public void output() {
		try {
			int[] num = new int[4];
			num[4]=99;
			System.out.println(num[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위밖");
		}
	}

}
