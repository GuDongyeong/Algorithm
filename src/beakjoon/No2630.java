package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2630 {
	public static int white = 0;
	public static int blue = 0;
	public static int[][] paper;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(reader.readLine());
		
		paper = new int[length][length];
		
		for(int i=0;i<length;i++) {
			String[] strArr = reader.readLine().split(" ");
			for(int j=0;j<length;j++) {
				paper[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		
		cut(0, 0, length);
		
		System.out.println(white);
		System.out.println(blue);
	}

	private static void cut(int x, int y, int length) {
		
		int color = paper[x][y];

		if( length == 1 ) {
			if( color == 0 ) {
				white++;
				return;
			}else {
				blue++;
				return;
			}
		}
		
		for(int i=x;i<x+length;i++) {
			for(int j=y;j<y+length;j++) {
				if(color != paper[i][j]) {
					cut(x, y, length/2);
					cut(x + length/2, y, length/2);
					cut(x, y + length/2, length/2);
					cut(x + length/2, y + length/2, length/2);
					return;
				}
			}
		}
		
		if( color == 0 ) {
			white++;
			return;
		}else if( color == 1) {
			blue++;
			return;
		}
		
	}

}
