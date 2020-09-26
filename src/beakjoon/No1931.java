import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int timeCnt = Integer.parseInt(reader.readLine());
		
		int[][] timeTable = new int[timeCnt][2];
		
		for(int i=0;i<timeCnt;i++) {
			String[] str = reader.readLine().split(" ");
			timeTable[i][0] = Integer.parseInt(str[0]);
			timeTable[i][1] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(timeTable, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if( o1[1] == o2[1]) return o1[0] - o2[0];
				else return o1[1] - o2[1];
			}
			
		});
		
		int endTime = -1;
		int cnt = 0;
		for(int j=0;j<timeCnt;j++) {
			if(timeTable[j][0] >= endTime) {
				endTime = timeTable[j][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
