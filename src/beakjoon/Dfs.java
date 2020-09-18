package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dfs {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = reader.readLine().split(" ");
		int cnt = Integer.parseInt(str[0]);
		int line = Integer.parseInt(str[1]);
		int start = Integer.parseInt(str[2]);
		
		int[][] arr = new int[cnt][cnt];

		String[] str2;
		int a;
		int b;
		for(int j=0;j<line;j++) {
			str2 = reader.readLine().split(" ");
			a = Integer.parseInt(str2[0]);
			b = Integer.parseInt(str2[1]);
			System.out.println(a + " " + b);
			arr[a-1][b-1] = arr[b-1][a-1] = 1;
		}
		
		// 모든 노드 방문 여부
		boolean[] visited = new boolean[cnt];
		
		dfs(start, visited, arr);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		bfs(start, visited, arr, queue);
		
		
	}
	
	// dfs 순환호출
	public static void dfs(int v, boolean visited[], int[][] arr) {
		
		// 현재 노드 출력
		System.out.print(v + " ");
		// 방문 처리
		visited[v-1] = true;
		
		// 방문한 노드와 인접한 모든 노드 가져오기
		for(int i=0;i<arr.length;i++) {
			if( arr[v-1][i] == 1) {
				
				if( !visited[i] ) {
					dfs(i+1, visited, arr);
					
				}
				
			}
			
		}
		
	}
	
	public static void bfs(int start, boolean[] visited, int[][] arr, Queue<Integer> queue) {
		
	}
	

}
