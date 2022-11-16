package java1116;
import java.util.Date;

public class Return_Ex {
	public void test() {
		//리턴값이 없다
	}
	public int test2() {
		int tot = 80+90+5-4+56;
		return tot;
	}
	
	public String test3() {
	String str="하하"+"호호"+"해해";
		return str;
	}
	
	public boolean test4() {
		return true;
	}
	
	public Date test5() {
		Date today=new Date();
		return today;
	}
	
	public int[] test6() {
		int[]arr = new int[3];
		return arr;
	}
}
