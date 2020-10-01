package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = reader.readLine();
			if(".".equals(str)) {
				return;
			}
			System.out.println(isBalanced(str));
		}
	}

	private static String isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		boolean check = true;
		
		char[] chArr = str.toCharArray();
		
		for(int i=0;i<chArr.length;i++) {
			if( chArr[i] == '(' || chArr[i] == '[') {
				stack.add(chArr[i]);
			}else if( chArr[i] == ')') {
				if( !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}else {
					check = false;
					break;
				}
			}else if( chArr[i] == ']') {
				if( !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				}else {
					check = false;
					break;
				}
			}
		}
		
		if( !stack.isEmpty()) check = false;
			
		return check?"yes":"no";
	}
}
