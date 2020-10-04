package beakjoon;

public class ReturnTest {
	public static int num = 0;
	public static void main(String[] args) {
		cut(0);
	}
	
	public static void cut(int i) {
		
		if( i == 3 ) return;
		
		cut(i+1);
		
		System.out.println(i);
	}

}
