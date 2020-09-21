package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No15652 {

	public static int n;
	public static int m;
	public static char[] list;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = reader.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		list = new char[m*2];
		for(int i=1;i<m*2;i+=2) {
			list[i] = ' ';
		}
		back(0, 1);
		System.out.println(sb.toString());
	}

	private static void back(int depth, int a) {
		if(depth == m) {
			sb.append(list).append("\n");
			return;
		}
		depth++;
		for(int i=a;i<=n;i++) {
			list[(depth-1)*2] = (char)(i + '0');
			back(depth, i);
		}
		
		
	}

}
