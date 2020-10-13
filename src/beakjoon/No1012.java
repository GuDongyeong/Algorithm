package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1012 {
	public static int[][] farm;
	public static boolean[][] visited;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int i=0;i<testCase;i++) {
				
				String[] strArr = reader.readLine().split(" ");
				
				int m = Integer.parseInt(strArr[0]);
				int n = Integer.parseInt(strArr[1]);
				int k = Integer.parseInt(strArr[2]);
				farm = new int[n][m];
				visited = new boolean[n][m];

				for(int j=0;j<k;j++) {
					String[] loc = reader.readLine().split(" ");

					int col = Integer.parseInt(loc[0]);
					int row = Integer.parseInt(loc[1]);
					farm[row][col] = 1;
 				}
				
				int cnt = 0;
				for(int o=0;o<n;o++) {
					for(int l=0;l<m;l++) {
						if( farm[o][l] == 1 ) {
							if( !visited[o][l] ) {
								cnt++;
								dfs(o, l);
							}
						}
					}
				}
				
				sb.append(cnt + "\n");
			}
			
			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dfs(int row, int col) {
		
		if( farm[row][col] == 0 ) return;
		if( visited[row][col] ) return;
		visited[row][col] = true;
		
		if( row - 1 >= 0) dfs(row-1, col);
		if( row + 1 < visited.length ) dfs(row+1, col);
		if( col - 1 >=0 ) dfs(row, col - 1);
		if( col + 1 < visited[row].length )	dfs(row, col + 1);
	}

}
