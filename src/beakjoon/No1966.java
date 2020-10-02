package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(reader.readLine());
		
		for(int i=0;i<testCase;i++) {
			String[] str1 = reader.readLine().split(" ");
			int doc = Integer.parseInt(str1[0]);
			int loc = Integer.parseInt(str1[1]);
			
			List<Integer> qu = new ArrayList<>();
			
			String[] str2 = reader.readLine().split(" ");
			
			for(int j=0;j<doc;j++) {
				qu.add(Integer.parseInt(str2[j]));
			}
			int cnt = 0;
			while(qu.size() > 0) {
				
				int n = qu.get(0);
				boolean flag = true;
				for(int k=1;k<qu.size();k++) {
					if( n < qu.get(k)) {
						flag = false;
						qu.add(qu.remove(0));
						if( loc == 0 ) {
							loc += qu.size()-1;
						}else {
							loc--;
						}
						break;
					}
					
				}
				
				if( flag ) {
					cnt++;
					if( loc == 0 ) {
						System.out.println(cnt);
						break;
					}else {
						qu.remove(0);
					}
				}
			}
		}
	}
}
