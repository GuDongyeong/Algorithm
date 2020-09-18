package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = reader.readLine().split(" ");
		
		int num1 = reverse(arr[0]);
		int num2 = reverse(arr[1]);
		
		System.out.println(Math.max(num1, num2));
		
	}
	
	public static int reverse(String str) {
		
		char[] arr = str.toCharArray();
		
		char temp = 0;
		temp = arr[2];
		arr[2] = arr[0];
		arr[0] = temp;
		
		String res = String.valueOf(arr);
		
		return Integer.parseInt(res);
	}

}
