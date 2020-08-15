package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class View {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 테스트 케이스 개수
		
		for(int i=1;i<=10;i++) {
			
			int testCnt = Integer.parseInt(reader.readLine());
			// 총 칸
			int[] arr = new int[testCnt];
			
			String[] house = reader.readLine().split(" ");
			
			for(int j=0;j<house.length;j++) {
				arr[j] = Integer.parseInt(house[j]);
			}
			
			int viewCnt = 0;
			
			for(int l=2;l<testCnt-2;l++) {
				
				if( arr[l] > arr[l-1] && arr[l] > arr[l+1] && arr[l] > arr[l-2] && arr[l] > arr[l+2]) {
					int tmp = Math.max(arr[l-1], arr[l-2]);
					int tmp2 = Math.max(arr[l+1], arr[l+2]);
					viewCnt += arr[l] - Math.max(tmp, tmp2);
				}
				
			}
			
			System.out.println("#" + i + " " + viewCnt);
			
		}
		
	}

}
