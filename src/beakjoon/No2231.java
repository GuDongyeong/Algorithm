package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		int result = 0;
		for(int i=num-(str.length()*9);i<num;i++) {
			int sum = i;
			int n = i;
			while(n != 0 ) {
				sum += n%10;
				n = n/10;
			}
			
			if(sum == num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}

}
