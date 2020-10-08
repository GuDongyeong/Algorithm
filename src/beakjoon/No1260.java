package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class No1260 {
	public static ArrayList<Integer>[] graph;
	public static StringBuilder dfsSB = new StringBuilder();
	public static StringBuilder bfsSB = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] str = reader.readLine().split(" ");
			
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int v = Integer.parseInt(str[2]);
			
			graph = new ArrayList[n];
			
			for(int j=0;j<n;j++) {
				graph[j] = new ArrayList<Integer>();
			}
			
			for(int i=0;i<m;i++) {
				String[] line = reader.readLine().split(" ");
				graph[Integer.parseInt(line[0])-1].add(Integer.parseInt(line[1])-1);
				graph[Integer.parseInt(line[1])-1].add(Integer.parseInt(line[0])-1);
			}
			
			for( ArrayList<Integer> list : graph ) {
				Collections.sort(list);
			}
			
			
			boolean[] visited = new boolean[n];
			dfs(visited, v-1);
			System.out.println(dfsSB);
			
			Queue<Integer> qu = new LinkedList<>();
			boolean[] visited2 = new boolean[n];
			
			qu.add(v-1);
			
			bfs(qu, visited2);
			
			System.out.println(bfsSB);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	private static void bfs(Queue<Integer> qu, boolean[] visited2) {
		
		while( !qu.isEmpty()  ) {
			
			int v = qu.poll();
			bfsSB.append((v+1) + " ");
			visited2[v] = true;
			for(int i=0;i<graph[v].size();i++) {
				int n = graph[v].get(i);
				if( !visited2[n]) {
					visited2[n] = true;
					qu.add(n);
				}
			}
			
		}
	}

	private static void dfs(boolean[] visited, int v) {
		dfsSB.append((v+1) + " ");
		visited[v] = true;
		
		for(int i=0;i<graph[v].size();i++) {
			int node = graph[v].get(i);
			if( !visited[node] ) {
				dfs(visited, node);
			}
		}
		
	}

}
