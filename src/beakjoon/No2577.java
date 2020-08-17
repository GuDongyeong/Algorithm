package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2577 {
	public static void main(String[] args) throws IOException {
		
//		세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//
//		예를 들어 A = 150, B = 266, C = 427 이라면 
//
//		A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//
//		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if( a < 100 || a >= 1000 || b < 100 || b >= 1000 || c < 100 || c >= 1000) {
			System.exit(0);;
		}
		
		int mul = a * b * c;
		String str = String.valueOf(mul);
		
		int[] arr = new int[10];
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<10;j++) {
				if(str.charAt(i) - '0' == j) {
					arr[j]++;
					break;
				}
			}
		}
		
		for(int num :arr) {
			System.out.println(num);
		}
		
		
	}

}
