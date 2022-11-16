package exception;

public class Throws_Ex_Main {
	public static void main(String[] args) {
		Throws_Ex te = new Throws_Ex();
		
		try {
		te.test();
		} 
		catch(ArithmeticException e) {
		System.out.println("0은안됨");
		
		}
		te.output();
		
		System.out.println("계속 실행");
	}

}
