package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int people = Integer.parseInt(reader.readLine());
		
		int[][] sizes = new int[people][2];
		int[] score = new int[people];
		Arrays.fill(score, 1);
		
		for(int i=0;i<people;i++) {
			String[] str = reader.readLine().split(" ");
			sizes[i][0] = Integer.parseInt(str[0]);
			sizes[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int j=0;j<people;j++) {
			for(int k=0;k<people;k++) {
				if(k==j) continue;
				
				if(sizes[j][0] < sizes[k][0] && sizes[j][1] < sizes[k][1]) {
					score[j]++;
				}
			}
		}
		
		for(int l=0;l<people;l++) {
			System.out.print(score[l] + " ");
		}
		
	}
}
