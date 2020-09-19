package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2447 {
	public static char[][] arr;
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(reader.readLine());
			arr = new char[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = ' ';
				}
			}
			
			star(0, 0, n);
			
			
			for(int k=0;k<n;k++) {
				System.out.println(arr[k]);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void star(int x, int y, int n) {
		if( n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		
		n = n/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1 && j==1) continue;
				star(x+i*n, y+j*n, n);
			}
		}
		
	}
}
