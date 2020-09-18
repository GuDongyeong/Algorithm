package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1152 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		}else {
			String[] arr = str.split(" ");
			System.out.println(arr.length);
		}
		
	}

}
