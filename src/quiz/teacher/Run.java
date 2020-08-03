package quiz.teacher;

import java.util.Arrays;
import java.util.Comparator;

public class Run {
	public static void main(String[] args) {
		
		int[] numArr1 = {3, 30, 34, 5, 9};
		System.out.println(solution(numArr1));
		
	}
	
	public static String solution(int[] numbers) {
		
		// String으로 정렬을 하면 아스키코드값으로 비교할 수 있음
		
		String[] arr = new String[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		// Comparator의 방식대로 오름차순 정렬해줌
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("-----------------------");
				String lValue = o2 + o1;
				System.out.println("lValue : " + lValue);
				String rValue = o1 + o2;
				System.out.println("rValue : " + rValue);
				
				System.out.println("-----------------------");
				
				System.out.println(lValue.compareTo(rValue));
				
				return lValue.compareTo(rValue);
			}
			
		});
		
		if(arr[0].equals("0")) {
			return "0";
		}
		
		StringBuilder sb = new StringBuilder();
		for( String s : arr) {
			sb.append(s);
		}
		
		return sb.toString();
	}
}
