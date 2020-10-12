package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No11724 {
	public static ArrayList<Integer>[] graph;
	public static int cnt = 0;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] strArr = reader.readLine().split(" ");
			
			int n = Integer.parseInt(strArr[0]);
			int m = Integer.parseInt(strArr[1]);
			
			graph = new ArrayList[n+1];
			
			for(int i=0;i<=n;i++) {
				graph[i] = new ArrayList<Integer>();
			}
			
			for(int j = 0;j<m;j++) {
				String[] line = reader.readLine().split(" ");
				int n1 = Integer.parseInt(line[0]);
				int n2 = Integer.parseInt(line[1]);
				
				graph[n1].add(n2);
				graph[n2].add(n1);
			}
			
			boolean[] visited = new boolean[n+1];
			
			for(int k = 1;k<=n;k++) {
				if( !visited[k] ) {
					cnt++;
					dfs(k, visited);
				}
			}
			
			System.out.println(cnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dfs(int k, boolean[] visited) {
		if( visited[k] ) return;
		
		visited[k] = true;
		
		for(int i=0;i<graph[k].size();i++) {
			dfs(graph[k].get(i), visited);
		}
	}

}
