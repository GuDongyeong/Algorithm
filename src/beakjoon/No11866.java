package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = reader.readLine().split(" ");
		int p = Integer.parseInt(strArr[0]);
		int order = Integer.parseInt(strArr[1]);
		StringBuilder sb = new StringBuilder();
		List<Integer> ll = new ArrayList<>();
		
		for(int i=1;i<=p;i++) {
			ll.add(i);
		}
		
		int idx = 0;
		sb.append("<");
		while( ll.size() > 1 ) {
			
			idx = idx+(order-1);
			
			if( idx >= ll.size() ) {
				idx = idx%ll.size();
			}
			sb.append(ll.remove(idx) + ", ");
		}
		
		sb.append(ll.remove(0) + ">");
		
		System.out.println(sb);
		
	}

}
