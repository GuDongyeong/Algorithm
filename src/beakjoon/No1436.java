package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 1 10000
		int seq = Integer.parseInt(reader.readLine());
		int cnt = 1;
		int num = 666;
		
		
		
		while(cnt < seq) {
			
			num++;
			if( String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);
		
		
	}

}
