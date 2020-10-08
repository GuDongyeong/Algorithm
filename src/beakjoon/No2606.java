package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No2606 {
	public static ArrayList<Integer>[] network;
	public static int cnt = 0;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int computer = Integer.parseInt(reader.readLine());
			int line = Integer.parseInt(reader.readLine());
			
			network = new ArrayList[computer+1];
			
			for(int j=0;j<computer+1;j++) {
				network[j] = new ArrayList<>();
			}
			
			for(int i=0;i<line;i++) {
				String[] strArr = reader.readLine().split(" ");
				network[Integer.parseInt(strArr[0])].add(Integer.parseInt(strArr[1]));
				network[Integer.parseInt(strArr[1])].add(Integer.parseInt(strArr[0]));
			}
			
			boolean[] visited = new boolean[computer+1];
			dfs(1, visited);
			
			System.out.println(cnt);
		
		
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	private static void dfs(int n, boolean[] visited) {
		visited[n] = true;
		
		for(int i=0;i<network[n].size();i++) {
			int com = network[n].get(i);
			if( !visited[com] ) {
				cnt++;
				dfs(com, visited);
			}
		}
		
	}

}
