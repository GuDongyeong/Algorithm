package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int people = Integer.parseInt(reader.readLine());
		
		String[] strArr = reader.readLine().split(" ");
		
		int[] time = new int[people];
		for(int i=0;i<people;i++) {
			time[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(time);
		
		int sum = 0;
		int res = 0;
		for(int j=0;j<people;j++) {
			sum += time[j];
			res += sum;
		}
		
		System.out.println(res);
	}

}
