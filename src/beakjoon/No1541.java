package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		String[] strArr = str.split("\\-");
		
		
		int[] arr = new int[strArr.length];
		int sum = 0;
		for(int i=0;i<strArr.length;i++) {
			String[] temp = strArr[i].split("\\+");
			for(int j=0;j<temp.length;j++) {
				arr[i] += Integer.parseInt(temp[j]);
			}
			
			if( i == 0 ) {
				sum = arr[i];
			}else{
				sum -= arr[i];
			}
			

		}
		
		System.out.println(sum);
	}

}
