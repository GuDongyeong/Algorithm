package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<testCase;i++) {
			
			Stack<Boolean> stack = new Stack<>();
			
			String str = reader.readLine();
			
			for(int j=0;j<str.length();j++) {
				
				if( str.charAt(j) == '(' ) {
					stack.push(true);
				}else if( str.charAt(j) == ')' && !stack.empty() ) {
					stack.pop();
				}else if(str.charAt(j) == ')' && stack.empty()){
					sb.append("NO\n");
					break;
				}
				
				if( j == str.length()-1) {
					if( stack.empty()) {
						sb.append("YES\n");
					}else {
						sb.append("NO\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}
