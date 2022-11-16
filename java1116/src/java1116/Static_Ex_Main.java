package java1116;

public class Static_Ex_Main {
	public static void main(String[] args) {
		
		//Static_Ex = se = new Static_Ex();	//객체를 생성
		//se.num = 99;
		//se.print();
		
		Static_Ex.chk = 88;
		Static_Ex.output();
		
		//statc요소는 객체 생성없이 사용할 수 있다.
		//클래스명.속성   클래스명.메소드()
		
		System.out.println(Static_Ex.iwon);
	}
}
