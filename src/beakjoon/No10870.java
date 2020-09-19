package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10870 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			int cnt = 1;
			int res = pi(n, cnt, 0, 1);
			
			System.out.println(res);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	public static int pi(int n, int cnt, int m1, int m2) {
		
		if( n == 0) return 0;
		if( n == 1) return 1;
		
		if( n <= cnt ) {
			return m2;
		}
		
		int m3 = m1 + m2;
		return pi(n, cnt+1, m2, m3);
	}

}
