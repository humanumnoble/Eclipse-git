package exception;

public class Array_Error {
	public static void main(String[] args) {
		
		int[]num = new int[5];
		
		//배열의 범위를 벗어날 경우
		num[0]=100;
		num[1]=200;
		num[5]=600;	//배열 0,1,2,3,4 범위를 벗어난 경우
		
		System.out.println("문장1");
		System.out.println("문장2");
		
	}

}
