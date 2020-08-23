package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int[][] arr;
		int min;
		int col;
		int row;
		int cnt;
		int testCase;
		int startPoint;
		
		for(int i=1;i<=10;i++) {
			
			arr = new int[102][102];
			testCase = Integer.parseInt(reader.readLine());
			
			for(int j=1;j<=100;j++) {
				st = new StringTokenizer(reader.readLine());
				
				for(int k=1;k<=100;k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			min = Integer.MAX_VALUE;
			startPoint = 0;
			
			for(int l=1;l<=100;l++) {
				cnt = 1;
				
				if( arr[1][l] == 1 ) {
					row = 1;
					col = l;
					while( row != 100 ) {
						
						if( arr[row][col-1] == 1 ) {
							while( arr[row][col-1] == 1) {
								cnt++;
								col--;
							}
						}else if(arr[row][col + 1] == 1 ) {
							while( arr[row][col + 1] == 1) {
								cnt++;
								col++;
							}
						}
						row++;
						cnt++;
					}
					
					if( cnt < min ) {
						min = cnt;
						startPoint = l;
					}
				}
			}// 모든 경로 검사
			
			System.out.println("#" + testCase + " " + (startPoint-1));
			
		}// testCase End
	}
}


