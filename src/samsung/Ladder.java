package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int[][] arr = new int[102][102];
		int load;
		int endPoint = 0;
		
		for(int i=1;i<=10;i++) {
			
			load = 100;
			
			int testCase = Integer.parseInt(reader.readLine());
			
			
			for(int j=1;j<=100;j++) {
				st = new StringTokenizer(reader.readLine());
				
				for(int k=1;k<=100;k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
					
					if( arr[j][k] == 2 ) {
						endPoint = k;
					}
				}
			}
			
			while( load != 1 ) {
				
				if( arr[load][endPoint -1] == 1 ) {
					while( arr[load][endPoint -1] == 1) {
						endPoint--;
					}
				}else if(arr[load][endPoint + 1] == 1 ) {
					while( arr[load][endPoint + 1] == 1) {
						endPoint++;
					}
				}
				
				load--;
			}
			
			System.out.println("#" + i + " " + (endPoint -1));
			
		}
		
	}

}
