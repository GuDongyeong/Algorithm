package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(reader.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<testCase;i++) {
			int num = Integer.parseInt(reader.readLine());
			
			if( num == 0 ) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
		
	}

}
