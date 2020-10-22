package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No2819 {
	public static int[][] arr = new int[4][4];
	public static int[] dr = {-1, 1, 0, 0};
	public static int[] dc = {0, 0, -1, 1};
	public static HashSet<String> set;
	public static StringTokenizer st;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int i=1;i<=testCase;i++) {
				
				for(int j=0;j<4;j++) {
					st = new StringTokenizer(reader.readLine());
					for(int k=0;k<4;k++) {
						arr[j][k] = Integer.parseInt(st.nextToken());
					}
				}
				
				set = new HashSet<>();
				for(int l=0;l<4;l++) {
					for(int m=0;m<4;m++) {
						dfs(l, m, 0, String.valueOf(arr[l][m]));
					}
				}
				
				System.out.println("#" + i + " " + set.size());
			}
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	private static void dfs(int x, int y, int cnt, String str) {
		if( cnt >= 6 ) {
			set.add(str);
			return;
		}
		
		for(int i=0;i<dc.length;i++) {
			int r = x + dr[i];
			int c = y + dc[i];
			if( r >= 0 && r < 4 && c >=0 && c < 4) {
				dfs(r, c, cnt +1, str + arr[r][c]);
			}
			
		}
	}

}
