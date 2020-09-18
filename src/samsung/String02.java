package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] charArr;
			
		for(int i=1;i<=10;i++) {
				
			int len = Integer.parseInt(reader.readLine());
			int cnt=0;
			
			charArr = new char[8][8];
			String str;
			
			for(int j=0;j<8;j++) {
				str = reader.readLine();
				for(int k=0;k<8;k++) {
					charArr[j][k] = str.charAt(k);
				}
			}
			
			for(int m = 0;m<8;m++) {
				
				for(int n=0;n<=8-len;n++) {
					int p = n + n + len -1;
					
					cnt += test1(charArr, p, m ,n);
					cnt += test2(charArr, p, n, m);
					
				}
			
			}
			
			System.out.println("#" + i + " " + cnt); 
		}
	}

	public static int test1(char[][] charArr, int p, int m, int n) {
		
		if(n > p-n) {
			return 1;
		}
		
		if(charArr[m][n] == charArr[m][p-n]) {
			return test1(charArr, p, m, ++n);
		}
		
		return 0;
	}
	
	public static int test2(char[][] charArr, int p, int m, int n) {
		
		if(m > p-m) {
			return 1;
		}
		
		if(charArr[m][n] == charArr[p-m][n]) {
			return test2(charArr, p, ++m, n);
		}
		
		return 0;
	}

}
