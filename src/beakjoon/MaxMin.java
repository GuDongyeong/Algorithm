package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {
	public static void main(String[] args) throws IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = new Integer(br.readLine()),
	            sign = 1, num = 0;
	        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	        for (int c:br.readLine().getBytes()){
	            if (c == '-')
	                sign = -1;
	            else if (c >= '0' && c <= '9')
	                num = num*10 + c - '0';
	            else if (c == ' '){
	                num *= sign;
	                min = Math.min(min, num);
	                max = Math.max(max, num);
	                num = 0;
	                sign = 1;
	            }
	        }
	        num *= sign;
	        min = Math.min(min, num);
	        max = Math.max(max, num);
	        System.out.println(min + " " + max);

	}

}
