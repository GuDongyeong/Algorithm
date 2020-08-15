package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[100];
		
		
		for(int i=1;i<=10;i++) {
			int testCase = Integer.parseInt(in.readLine());
			int cnt = 0;
			StringTokenizer token = new StringTokenizer(in.readLine());
			
			
			for(int j=0;j<100;j++) {
				arr[j] = Integer.parseInt(token.nextToken());
			}
			
			while(cnt < testCase) {

				Arrays.sort(arr);
				

				if( arr[99] - arr[0] > 1) {
					arr[99] -= 1;
					arr[0] += 1;
					
					cnt++;
					
				}else {
					break;
				}
				
			}

			Arrays.sort(arr);

			System.out.println("#" + i + " " + (arr[99] - arr[0]));
			
		}
	}

}
