package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = reader.readLine().toCharArray();
		
		int cnt = arr.length;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == '=') {
				if( arr[i-1] == 'c' || arr[i-1] == 's' || arr[i-1] == 'z') {
					cnt--;
				}
			}else if( arr[i] == '-') {
				if( arr[i-1] == 'c' || arr[i-1] == 'd') {
					cnt--;
				}
			}else if(arr[i] == 'z') {
				if( i + 1 == arr.length) break;
				if( arr[i-1] == 'd' && arr[i+1] == '=') {
					cnt -= 2;
					i++;
				}
			}else if( arr[i] == 'j') {
				if(arr[i-1] == 'l' || arr[i-1] == 'n') {
					cnt--;
				}
			}
			
		}
		
		System.out.println(cnt);
		
		
		
	}

}
