package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1920 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			
			int[] arrN = new int[n];
			
			String[] str = reader.readLine().split(" ");
			
			for(int i=0;i<n;i++){
				arrN[i] = Integer.parseInt(str[i]);
			}
			
			Arrays.sort(arrN);
			
			int m = Integer.parseInt(reader.readLine());
			
			int[] arrM = new int[m];
			String[] str2 = reader.readLine().split(" ");
			
			for(int j=0;j<m;j++) {
				int number = Integer.parseInt(str2[j]);
				
				int res = exist(arrN, number, 0, n-1);
				System.out.println(res);
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

	private static int exist(int[] arrN, int number, int start, int end) {
		
		if(start > end ) return 0;
		int mid = (start + end )/2;
		if(number == arrN[mid] ) return 1;
		else if(number > arrN[mid] ) return exist(arrN, number, mid + 1, end);
		else return exist(arrN, number, start, mid -1);
	}
}
