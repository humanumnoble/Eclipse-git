package exception;

public class NullPoint_Exception {
	public static void main(String[] args) {
		String str = null;
		String str2 = "홍길동";
		
		try {
			if(str.equals(str2)) {
				System.out.println("같다");
			} 
			else {
				System.out.println("다르다");
			}
		}
		
		catch(NullPointerException e) {
			System.out.println("null 입니다");
		}
	}

}
