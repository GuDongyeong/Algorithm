package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No15650 {
	
	public static int n;
	public static int m;
	public static boolean[] check;
	public static StringBuilder sb = new StringBuilder();
	public static int[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = reader.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		check = new boolean[n];
		list = new int[m];
		back(0, 0);
		System.out.println(sb.toString());
	}

	private static void back(int cnt, int k) {
		if(cnt == m ) {
			for( int a : list ) {
				sb.append(a + " ");
			}
			sb.append("\n");
			return;
		}
		
		
		cnt++;
		for(int i=k;i<n;i++) {
			if( check[i]) continue;
			check[i] = true;
			list[cnt-1] = i+1;
			back(cnt, i+1);
			check[i] = false;
		}
		
		
	}

}
