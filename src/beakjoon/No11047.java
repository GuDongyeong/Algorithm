import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No11047 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] str = reader.readLine().split(" ");
			int kind = Integer.parseInt(str[0]);
			int amount = Integer.parseInt(str[1]);
			
			int[] arr = new int[kind];
			
			for(int i=0;i<kind;i++) {
				arr[i] = Integer.parseInt(reader.readLine());
			}
			
			int cnt = 0;
			for(int j=kind-1;j>=0;j--) {
				if(arr[j] <= amount) {
					cnt += amount/arr[j];
					amount = amount%arr[j];
				}
				
				if( amount == 0 ) break;
			
			}	
			
			System.out.println(cnt);
			
			
		}catch(Exception e) {
			
		}
		
	}

}
