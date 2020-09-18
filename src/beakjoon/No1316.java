package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(reader.readLine());
		int cnt=0;
		
		for(int i=0;i<test;i++) {
			boolean[] arr = new boolean[26];
			String str = reader.readLine();
			char prev=0;
			
			for( int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				if( arr[(int)ch - 97] == false) {
					arr[(int)ch - 97] = true;
				}else {
					if( prev != ch) {
						break;
					}
				}
				
				if( j + 1 == str.length()) cnt++;
				prev = ch;
			}
			
		}
		
		System.out.println(cnt);
		
	}
}
