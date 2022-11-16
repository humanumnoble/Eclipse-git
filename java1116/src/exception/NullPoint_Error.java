package exception;

public class NullPoint_Error {
	public static void main(String[] args) {
		String str = null;
		String str2 = "홍길동";
		
		if(str.equals(str2)) {
			System.out.println("같다");
		} 
		else {
			System.out.println("다르다");
		}
	}
}
