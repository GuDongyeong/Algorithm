package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if( a < 100 || a >= 1000 || b < 100 || b >= 1000 || c < 100 || c >= 1000) {
			System.exit(0);;
		}
		
		String str = String.valueOf(a * b * c);
		
		int[] arr = new int[10];
		
		for(int i=0;i<str.length();i++) {
			
			int idx = str.charAt(i) - '0';
			
			arr[idx]++;
			
		}
		
		for(int num :arr) {
			System.out.println(num);
		}
	}
	

}
