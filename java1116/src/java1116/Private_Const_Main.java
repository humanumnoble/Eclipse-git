package java1116;

import java.time.LocalDate;
import java.util.Calendar;

public class Private_Const_Main {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate xday = LocalDate.now();
		
		if(today.equals(xday)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		Calendar cal = Calendar.getInstance();
		
		//Private_Const pc = new Private Const();
		//생성자가 private 이라 다른 클래스에서 생성자를 동작시키지 못한다.
		
		Private_Const pc = Private_Const.getInstance();
		Private_Const pc2=Private_Const.getInstance();
		
		pc.kor=90;
		System.out.println(pc.kor);
		System.out.println(pc2.kor);
		
		// equals() : 객체와 객체가 같은지 비교한다.

		if(pc.equals(pc2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
