package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No9663 {
	public static int cnt = 0;
	public static int[] pan; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(reader.readLine());
		
		pan = new int[size];
		Arrays.fill(pan, -1);
		queen(0);
		
		System.out.println(cnt);
	}
	
	private static void queen(int row) {
		
		if( row == pan.length ) {
			cnt++;
			return;
		}
		

		for(int i=0;i<pan.length;i++) {
			pan[row] = i;
			if( !check(row) ) continue;
			queen(row + 1);
		}
		
		
	}
	private static boolean check(int row) {
		
		for(int i=0;i<row;i++) {
			if(pan[i] == pan[row] ) return false;
			
			if(Math.abs(pan[row] - pan[i]) == Math.abs(row-i) ) return false;
		}
		
		return true;
	}
}
