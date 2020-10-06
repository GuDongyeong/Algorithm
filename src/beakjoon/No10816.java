package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No10816 {
	public static int[] card;
	public static int[] number;
	public static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		
		card = new int[n];
		String[] str = reader.readLine().split(" ");
		
		for(int i=0;i<n;i++) {
			card[i] = Integer.parseInt(str[i]);
		}
		
		int m = Integer.parseInt(reader.readLine());
		String[] str2 = reader.readLine().split(" ");
		number = new int[m];
		
		for(int j=0;j<m;j++) {
			number[j] = Integer.parseInt(str2[j]);
 		}
		
		Arrays.sort(card);
		for(int k=0;k<m;k++) {
			int res = searchR(0, n-1, number[k]) - searchL(0, n-1, number[k]);
			sb.append(res + " ");
		}
		System.out.println(sb);
	}
	
	private static int searchR(int start, int end, int i) {
		
		int mid = (start+end)/2;
		if( start >= end ) return mid;

		if( i >= card[mid]) {
			return searchR(mid + 1, end, i);
		}else{
			return searchR(start, mid - 1, i);
		}
		
	}

	private static int searchL(int start, int end, int i) {
		
		int mid = (start+end)/2;
		if( start > end ) return mid;
		if( i <= card[mid]) {
			return searchL(start, mid - 1, i);
		}else {
			return searchL(mid+1, end, i);
		}
		
	}

}
