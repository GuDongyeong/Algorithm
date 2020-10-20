package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11726 {
	public static int[] m;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			m = new int[n+1];
			m[0] = 1;
			m[1] = 1;
			
			
			System.out.println(dp(n));
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

	private static int dp(int n) {
		if(m[n] > 0) return m[n] % 10007;
		
		m[n] = dp(n-1)+dp(n-2);
		return m[n];
	}

}
