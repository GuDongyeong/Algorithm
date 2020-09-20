package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2798 {
	public static int goal; // 목표값
	public static int max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dealer = reader.readLine().split(" ");
		
		int n = Integer.parseInt(dealer[0]);
		goal = Integer.parseInt(dealer[1]);
		
		String[] cardStr = reader.readLine().split(" ");
		int[] cardArr = new int[n];
		for(int i=0;i<n;i++) {
			cardArr[i] = Integer.parseInt(cardStr[i]);
		}
		
//		System.out.println(Arrays.toString(cardArr));
		
		for(int j=0;j<n-2;j++) {
//			System.out.print(j + "카드");
			card(cardArr, 1, cardArr[j], n, j+1);
//			System.out.println();
		}
		System.out.println(max);
	}

	private static void card(int[] cardArr, int cnt, int sum, int n, int j) {
		
		// 3번하면 끝내기
		if(cnt == 3) {
			if( sum > max ) {
				max = sum;
			}
			return;
		}
		
		cnt++;
		for(int i=j;i<n;i++) {
			if( sum + cardArr[i] > goal ) {
				continue;
			}

//			System.out.print(cnt + "번째 \t" + i + "카드");
			
			card(cardArr, cnt, sum + cardArr[i], n, i+1);
			
//			System.out.println();
		}
		
	}

}
