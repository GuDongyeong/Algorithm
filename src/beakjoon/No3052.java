package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class No3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int tmp = Integer.parseInt(in.readLine());
			
			if( tmp < 0 || tmp >= 1000) {
				System.exit(0);
			}
			
			arr[i] = tmp % 42;
		}
		
		Arrays.sort(arr);
		
		int cnt = 1;
		
		for(int j=0;j<arr.length-1;j++) {
			if( arr[j] != arr[j+1]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
