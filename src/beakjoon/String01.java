package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String sStr;
		String lStr;
		int cnt;
		
		for(int i=0;i<=10;i++) {
			
			int testCase = Integer.parseInt(reader.readLine());
			cnt = 0;
			sStr = reader.readLine();
			lStr = reader.readLine();
			
			for(int j=0;j<lStr.length()-sStr.length();j++) {
				if( sStr.equals(lStr.substring(j, j+sStr.length()))){
					cnt++;
				}
			}
			
			if( sStr.equals(lStr.substring(lStr.length()-sStr.length()))){
				cnt++;
			}
			
			System.out.println("#" + testCase + " " + cnt);
			
		}
	}

}
