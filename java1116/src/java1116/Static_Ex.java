package java1116;

public class Static_Ex {
	//static : 객체 생성없이 메모리에 로딩되는 요소(속성,메소드)
	//모든 객체는 new 연산자를 통해 메모리에 생성
	
	int num;
	static int chk;
	static int iwon=100;
	
	public void print() {	//instance 요소
		System.out.println("print메소드");
	}
	
	public static void output() {	//static 요소
		System.out.println("static메소드");
		System.out.println(iwon);
		//System.out.println(num);	
		//static 메소드에는 instance 요소가 들어가지 못한다.
	}
}
