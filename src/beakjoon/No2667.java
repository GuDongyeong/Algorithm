package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No2667 {
	public static List<Integer> result = new ArrayList<>();
	public static StringBuilder sb = new StringBuilder();
	public static boolean[][] visited;
	public static int[][] map;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			map = new int[n][n];
			visited = new boolean[n][n];
			
			for(int i=0;i<n;i++) {
				String str = reader.readLine();
				for(int j=0;j<n;j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			
			for(int k=0;k<n;k++) {
				for(int l=0;l<n;l++) {
					if( !visited[k][l] ) {
						if( map[k][l] != 0 ) {
							result.add(0);
							dfs(k, l, result.size()-1);
						}
					}
				}
			}
			
			Collections.sort(result);
			sb.append(result.size() + "\n");
			for(int cnt : result) {
				sb.append(cnt + "\n");
			}
			
			System.out.println(sb);
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dfs(int x, int y, int index) {
		
		visited[x][y] = true;
		result.set(index, result.get(index) + 1);

		if( x-1 >= 0 ) {
			if(map[x-1][y] == 1 && visited[x-1][y] == false ) {
				dfs(x-1, y, index);
			}
		}
		
		if( x + 1 < map.length ) {
			if(map[x+1][y] == 1 && visited[x+1][y] == false ) {
				dfs(x+1, y, index);
			}
		}
		
		if( y-1 >= 0 ) {
			if(map[x][y-1] == 1 && visited[x][y-1] == false ) {
				dfs(x, y-1, index);
			}
		}
			
		if( y+1 < map.length ) {
			if(map[x][y+1] == 1 && visited[x][y+1] == false ) {
				dfs(x, y+1, index);
			}
		}
	}
}
