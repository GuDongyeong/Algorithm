package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPrice {
	public static int max;
	public static int move;

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int i=1;i<=testCase;i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				
				String numbers = st.nextToken();
				
				int[] numArr = new int[numbers.length()];
				
				for(int j=0;j<numArr.length;j++) {
					numArr[j] = numbers.charAt(j) - '0';
				}
				max=0;
				move = Integer.parseInt(st.nextToken());
				dfs(numArr, 0, 0);
				
				System.out.println("#" + i + " " + max);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dfs(int[] numArr, int k, int cnt) {
		if(cnt == move ) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<numArr.length;i++) {
				sb.append(numArr[i]);
			}
			if( Integer.parseInt(sb.toString()) > max ) {
				max = Integer.parseInt(sb.toString());
			}
			
			return;
		}
		
		for(int j=k;j<numArr.length;j++) {
			for(int l=k+1;l<numArr.length;l++) {
				int tmp = numArr[l];
				numArr[l] = numArr[j];
				numArr[j] = tmp;
				dfs(numArr, j, cnt+1);
				numArr[j] = numArr[l];
				numArr[l] = tmp;
			}
		}
		
	}
}
