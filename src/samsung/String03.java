package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] charArr;
			
		for(int i=1;i<=10;i++) {
				
			charArr = new char[100][100];
			int test = Integer.parseInt(reader.readLine());
			String str;
			int max = 0;
			int len=0;
			boolean flag1 = false;
			boolean flag2 = false;
			
			for(int j=0;j<100;j++) {
				str = reader.readLine();
				for(int k=0;k<100;k++) {
					charArr[j][k] = str.charAt(k);
				}
			}
			
			for (int k = 0; k < 100 ; k++) {
//				System.out.println(k + " " + max);
//				if( max >= 100-k) break;

				for (int l = k; l < 100; l++) {

//					if( max >= 100-l) break;
					
					for (int m = 99; m > l; m--) {
						
//						if( m-l < max ) break;
						
						int p = l + m;
						
						flag1 = chk1(charArr, k, l, p);
						flag2 = chk2(charArr, k, l, p);
						if( flag1 || flag2 ) {
							len = m-l+1;
							if( max < len ) {
								max = len;
							}
						}
					}
				}
			}
			
			
			System.out.println("#" + test + " " + max ); 
		}
	}

	private static boolean chk1(char[][] charArr, int k, int l, int p) {
		
		if( l > p-l ) {
			return true;
		}
		if( charArr[k][l] == charArr[k][p-l]) {
			return chk1(charArr, k, ++l, p);
		}else {
			return false;
		}
	}

	private static boolean chk2(char[][] charArr, int k, int l, int p) {
		
		if( l > p-l ) {
			return true;
		}
		if( charArr[l][k] == charArr[p-l][k]) {
			return chk2(charArr, k, ++l, p);
		}else {
			return false;
		}
	}

}
