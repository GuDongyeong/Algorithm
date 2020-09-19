package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		long res = fac(n);
		
		System.out.println(res);
	}
	
	public static long fac(int n) {
		
		if( n <= 1 ) {
			return 1;
		}
		
		return n * fac(n-1);
	}

}
