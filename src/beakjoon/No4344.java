package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//		출력
//		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int caseCnt = Integer.parseInt(in.readLine());
		
		for( int i=0; i<caseCnt; i++) {
			
			String[] arr = in.readLine().split(" ");
			int[] arr2 = new int[Integer.parseInt(arr[0])];
			
			int sum = 0;
			
			for(int j =1;j<arr.length;j++) {
				
				arr2[j-1] = Integer.parseInt(arr[j]);
				sum += arr2[j-1];
			}
			
			double avg = sum/arr2.length;
			int cnt = 0;
			
			for(int k=0;k<arr2.length;k++) {
				if(avg < arr2[k]) {
					cnt++;
				}
			}
			
			sb.append( String.format("%.3f", (double)cnt/arr2.length*100) + "%\n");
		}
		
		System.out.println(sb);
		
	}

}
