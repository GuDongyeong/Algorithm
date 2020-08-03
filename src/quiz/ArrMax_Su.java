package quiz;
import java.util.Arrays;
public class ArrMax_Su {
	
   public static void main(String[] args) {
       int[] a1= {0,0,0};
       System.out.println(solution(a1));
       
    }
    public static String solution(int[] numbers) {
       // String arr 에 numbers의 길이만큼 담아준다
        String[] arr = new String[numbers.length];
        
        // numbers의 길이만큼 1씩증가
        for (int i = 0; i < numbers.length; i++) {
           //배열 arr[i]에 numbers[i]에 담아준다
        arr[i] = String.valueOf(numbers[i]);
        }
      //정렬 arr 기준값.compareTo(비교대상)
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
                
        if(arr[0].equals("0")) return "0";
         
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);
        return sb.toString();
        
    }

    
}