package java1116;

public class Static_Ex2 {
	static int kor;
	static int eng;
	static int mat;
	static int tot, avg;
	
	public static void input() {
		
	}
	
	public static void total() {
		tot=kor+eng+mat;
	}
	
	public static void average() {
		avg=(kor+eng+mat)/3;
	}
	
	public static void output() {
		System.out.println(tot);
		System.out.println(avg);
	}
}
