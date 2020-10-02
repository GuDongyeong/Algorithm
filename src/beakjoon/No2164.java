package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			qu.add(i);
		}
		
		while(qu.size() > 1) {
			qu.poll();
			qu.add(qu.poll());
		}
		
		System.out.println(qu.peek());
	}

}
