package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 int[] arr = new int[Integer.parseInt(reader.readLine())+1];
		 
		 // 1일떄
		 arr[1] = 0;
		 
		 for(int i=2;i<arr.length;i++) {
			 
			 arr[i] = arr[i-1] + 1;
			 if( i%2 == 0 ) {
				 arr[i] = Math.min(arr[i], arr[i/2]+1);
			 }
			 if( i%3 == 0 ) {
				arr[i] = Math.min(arr[i], arr[i/3]+1);
			 }
		 }
		 
		 System.out.println(arr[arr.length-1]);
	}
}
