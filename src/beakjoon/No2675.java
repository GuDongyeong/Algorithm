package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(reader.readLine());
		int r = 0;
		StringBuilder sb = null;
		
		for(int i=0;i<testCase;i++) {
			
			sb = new StringBuilder();
			String[] str = reader.readLine().split(" ");
			r = Integer.parseInt(str[0]);
			
			for(char ch : str[1].toCharArray() ) {
				for(int j=0;j<r;j++) {
					sb.append(ch);
				}
			}
			
			System.out.println(sb);
			
		}
	}

}
