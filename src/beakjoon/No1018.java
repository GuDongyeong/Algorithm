package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1018 {
	public static char[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int min = 64;
		
		String[] size = reader.readLine().split(" ");
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		
		arr = new char[n][];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = reader.readLine().toCharArray();
		}
		
		for(int j=0;j<=n-8;j++) {
			for(int k=0;k<=m-8;k++) {
				int cnt = Math.min(paint(j, k, 'B', 'W'), paint(j, k, 'W', 'B'));
				
				if( cnt < min ) {
					min = cnt;
				}
				
			}
		}
		
		System.out.println(min);
		
	}

	private static int paint(int j, int k, char c1, char c2) {
		int cnt = 0;
		for(int l=j;l<j+8;l++) {
			for(int o=k;o<k+8;o++) {
				if(l%2 == 0 ) {
					if(o%2 == 0) {
						if(arr[l][o] != c1) {
							cnt++;
						}
					}else {
						if(arr[l][o] != c2) {
							cnt++;
						}
					}
				}else if(l%2 != 0 ){
					if(o%2 == 0) {
						if(arr[l][o] != c2) {
							cnt++;
						}
					}else {
						if(arr[l][o] != c1) {
							cnt++;
						}
					}
				}
				
			}
		}
		return cnt;
	}
}
