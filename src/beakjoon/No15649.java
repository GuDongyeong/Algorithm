package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class No15649 {
	public static StringBuilder sb = new StringBuilder();
	public static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = reader.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		seq(n, m, 0);
		
		System.out.println(sb.toString());
		
		
	}

	private static void seq(int n, int m, int cnt) {
		
		if( cnt == m ) {
			for( int a : list ) {
				sb.append(a + " ");
			}
			sb.append("\n");

			return;
		}
		
		cnt++;
		for(int i=1;i<=n;i++) {
			if( list.contains(i) ) continue;
			list.add(i);
			seq(n, m, cnt);
			list.removeLast();
		}
		
		
	}

}
