package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1780 {
	public static int[] answer = new int[3];
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			int n = Integer.parseInt(reader.readLine());
			
			int[][] paper = new int[n][n];
			
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				for(int j=0;j<n;j++) {
					paper[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			solve(paper, 0, 0, n);
			
			for( int a : answer ) {
				System.out.println(a);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	
	
	}
	private static void solve(int[][] paper, int x, int y, int length) {
		
		if(length < 1 ) return;
		int number = paper[x][y];
		boolean flag = true;
		
		for(int i=x;i<x+length;i++) {
			for(int j=y;j<y+length;j++) {
				if( paper[i][j] != number) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			answer[number+1]++;
		}else {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					solve(paper, x+i*(length/3), y+j*(length/3), length/3);
				}
			}
		}
	}

}
