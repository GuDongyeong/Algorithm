package samsung;

import java.util.Scanner;

public class Array1 {

public static void main(String args[]) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		
		for(int test_case = 1; test_case <= T; test_case++)	{
		
		int test_num = sc.nextInt();
		
		// 모든 점수
		int[] score = new int[1000];
		
		// 점수 카운팅
		int[] cnt = new int[101]; 
		
		// 가장 많은 점수의 수
		int maxCnt = 0;
		
		// 최빈 점수
		int maxScore = 0;
		
		for(int i=0;i<1000;i++) {
			score[i] = sc.nextInt();
			
			cnt[score[i]]++;
		}
		
		for(int j=0;j<=100;j++) {
			if( cnt[j] >= maxCnt) {
				maxCnt = cnt[j];
				
				maxScore = j;
			}
		}
		
		System.out.println("#" + test_num + " " + maxScore);
		
		}

	}

}
