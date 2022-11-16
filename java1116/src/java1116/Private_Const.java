package java1116;

public class Private_Const {
	int kor;
	private static Private_Const pc;
	
	//생성자가 private
	private Private_Const( ) {
		
	}
	
	//생성자가 private인 클래스는 
	//내부에서 객체를 생성뒤에 리턴을 통해 전달
	
	public static Private_Const getInstance() {
		if(pc==null) {
			pc = new Private_Const();
		}
		return pc;
	}
	
	public void print() {
		System.out.println("메소드 실행");
	}
}
