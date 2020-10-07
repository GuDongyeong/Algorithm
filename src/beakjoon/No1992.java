package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1992 {
	public static int[][] video;
	public static StringBuilder sb;
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(reader.readLine());
			video = new int[n][n];
			for(int i=0;i<n;i++) {
				String str = reader.readLine();
				for(int j=0;j<n;j++) {
					video[i][j] = str.charAt(j) - '0';
				}
			}
			
			sb = new StringBuilder();
			quadTree(0, 0, video.length);
			
			System.out.println(sb);
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}
	private static void quadTree(int x, int y, int length) {
		int spot = video[x][y];
		if(length == 1 ) {
			sb.append(spot);
			return;
		}
		for(int i=x;i<x+length;i++) {
			for(int j=y;j<y+length;j++) {
				if(spot != video[i][j]) {
					sb.append("(");
					quadTree(x, y, length/2);
					quadTree(x, y+length/2, length/2);
					quadTree(x+length/2, y, length/2);
					quadTree(x+length/2, y+length/2, length/2);
					sb.append(")");
					return;
				}
			}
		}
		
		sb.append(spot);
		
	}

}
