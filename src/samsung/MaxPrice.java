package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxPrice {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int i=0;i<testCase;i++) {
				String[] str = reader.readLine().split(" ");
				
				String numbers = str[0];
				int change = Integer.parseInt(str[1]);
				int cnt = 0;
				int index = 0;
				while( cnt < change ) {
					cnt++;
					
					
				}
				
				
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
