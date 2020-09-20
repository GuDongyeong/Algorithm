package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11729 {
	public static int cnt;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			cnt = 0;
			
			move(n, 1, 2, 3);
			
			System.out.println(cnt + "\n" + sb);
	} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void move(int n, int from, int by, int to) {
		cnt++;
		if( n == 1) { // n이 1이면 1 -> 3 으로
			sb.append(from + " " + to + "\n");
			return;
		}
		
		move(n-1, from, to, by); // n-1을 2로
		sb.append(from + " " + to + "\n");
		move(n-1, by, from, to); // n-1을 3으로
		
	}

}
