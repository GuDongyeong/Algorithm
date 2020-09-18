package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(reader.readLine());
		
		String num = reader.readLine();
		int sum=0;
		for(int i=0;i<cnt;i++) {
			sum += Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		System.out.println(sum);
	}
}
