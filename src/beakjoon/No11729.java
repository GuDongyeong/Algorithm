package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No11729 {
	public static int cnt;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			cnt = 0;
			
			move(s1, s2, s3, n);
			
			System.out.println(cnt);
	} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void move(Stack<Integer> s1, Stack<Integer> s2, Stack<Integer> s3, int n) {
		
	}

}
