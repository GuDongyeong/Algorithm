package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Integer[] arr = new Integer[26];
		for(int j=0;j<arr.length;j++) {
			arr[j] = 0;
		}
		
		String str = reader.readLine().toUpperCase();
		for(int i=0;i<str.length();i++) {
			arr[(int)str.charAt(i)-65]++;
		}
		
		int max = 0;
		char result = '?';
		
		for(int j=0;j<arr.length;j++) {
			if( arr[j] > max) {
				max = arr[j];
				result = (char)(j+65);
			}else if(arr[j] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);

	}

}
