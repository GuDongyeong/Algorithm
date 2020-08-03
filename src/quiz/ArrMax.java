package quiz;

import java.util.Scanner;

public class ArrMax {
	
	public static StringBuilder solution(int[] arr) {
		
		// 문자열 저장 변수
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<arr.length; i++) {
			
			// 원소를 문자로 변환
			String tmp = Integer.toString(arr[i]);
			
			// 가장 높은 자리수만 추출하여 int형 변환
			//  - '0' 하면 char형을 int 형으로 변환
			int num = tmp.charAt(0) - '0';
			
			for(int j=i;j<arr.length;j++) {
				
				// i인덱스 이후 원소 문자로 변환
				String tmp2 = Integer.toString(arr[j]);
				
				// 가장 높은 자리수만 추출하여 int 형 변환
				int num2 = tmp2.charAt(0)  - '0';
				
				// 높은 자리수끼리 비교, 뒤의 원소가 더 크면 앞으로 이동
				if( num < num2 ) {
					
					int t = arr[i];
					
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		
		for( int n : arr ) {
			sb.append(n);
		}
		
		return sb;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요 >> ");
		int length = sc.nextInt();
		int[] arr;
		
		if( length >= 1 && length <= 100000) {
			arr = new int[length];
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.println();
				System.out.print(i + "번째 원소 값을 입력하세요 >> ");
				int num = sc.nextInt();
				
				if( num >=0 && num <= 1000) {
					arr[i] = num;
				}else {
					System.out.println();
					System.out.println("[ERROR] 원소는 0이상 1,000이하 입니다");
					i--;
				}
			}
			
			System.out.println("가장 큰 수는? >> " + solution(arr));
		}else {
			System.out.println("[ERROR] 배열의 길이는 1이상 100,000이하 입니다.");
		}
		
	}
	
}