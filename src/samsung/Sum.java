package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		
		int[][] arr = new int[100][100];
		
		
		for(int i=0;i<10;i++) {
			
			int colMax = 0;
			int rowMax = 0;
			int diaR = 0;
			int diaL = 0;
			
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int j=0;j<100;j++) {
				
				st = new StringTokenizer(reader.readLine());
				int rowSum = 0;
				
				for(int k=0;k<100;k++) {
					
					arr[j][k] = Integer.parseInt(st.nextToken());
					rowSum += arr[j][k];
					
					// 대각선1
					if( j == k ) {
						diaL += arr[j][k];
					}
					
					// 대각선2
					if( j == 99-k) {
						diaR += arr[j][k];
					}
				}
				
				// 행의 합 최대값
				if( rowSum > rowMax ) {
					rowMax = rowSum;
				}
				
			}
			
			for(int l=0;l<100;l++) {
				int colSum = 0;
				for(int m=0;m<100;m++) {
					colSum += arr[m][l];
				}
				if( colSum > colMax) {
					colMax = colSum;
				}
			}
			
			int max = Math.max(Math.max(colMax, rowMax), Math.max(diaR, diaL));
			System.out.println("#" + testCase + " " + max);
			
			
		}
	}

}
