package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 알파벳 수 26
		int[] alpha = new int[26];
		for( int j=0;j<alpha.length;j++ ) {
			alpha[j] = -1;
		}
		
		// a 는 97
		char[] arr = reader.readLine().toCharArray();
		
		for( int i=0;i<arr.length;i++ ) {
			
			if( alpha[(int)arr[i] - 97] == -1 ) {
				alpha[(int)arr[i] - 97] = i;
			}
		}
		
		for(int a : alpha) {
			System.out.print(a + " ");
		}
	}

}
