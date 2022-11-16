package exception;

public class Array_Exception {
	public static void main(String[] args) {
		int[]num = new int[5];
		
		try {
		//배열의 범위를 벗어날 경우
		num[0]=100;
		num[1]=200;
		num[5]=600;	//배열 0,1,2,3,4 범위를 벗어난 경우
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("문장1");
		System.out.println("문장2");
	}

}
