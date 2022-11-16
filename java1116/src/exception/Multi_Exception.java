package exception;

public class Multi_Exception {
	public static void main(String[] args) {
		try {
/*			
			
			int num1=100;
			int num2=0;
			
			int result=num1/num2;
			
			int[]num = new int[5];
			num[5]=100;
			
			String str=null;
			String str2="홍길동";
			
			if(str.equals(str2)) {
				System.out.println("같다");
			}
			else {
				System.out.println("다르다");
			}
	*/	
			String n="a";
			int n2=Integer.parseInt(n);
			System.out.println(n2);
		}
		
		catch(ArithmeticException e) {
			System.out.println("0나누기 안됨");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위를 벗어남");
		}
		catch(NullPointerException e) {
			System.out.println("입력값이 null임");
		}
		catch(Exception e) {	//어떤 예외가 와도 다 받아준다.
			System.out.println("시스템 오류");
		}
		
		System.out.println("다른문장1");
		System.out.println("다른문장2");
	}

}
