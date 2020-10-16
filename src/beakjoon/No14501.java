package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No14501 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			int[] day = new int[n+10];
			int[] money = new int[n+10];
			
			for(int i=0;i<n;i++) {
				String[] str = reader.readLine().split(" ");
				day[i] = Integer.parseInt(str[0]);
				money[i] = Integer.parseInt(str[1]);
			}
			
			// 기억해놓을 것
			int[] m = new int[n+10];
			
			int max = 0;
			for(int i=0;i<n;i++) {
				m[i] = Math.max(max, m[i]);
				m[day[i] + i] = Math.max(m[day[i] + i], money[i] + m[i]);
				
				max = Math.max(max, m[i]);
			}
			System.out.println(max);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
