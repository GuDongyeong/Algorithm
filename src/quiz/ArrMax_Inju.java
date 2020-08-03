package quiz;

import java.util.Arrays;
import java.util.Comparator;

public class ArrMax_Inju{
   
   //숫자 배열
//   static int[] numArr = {6,10,2};
//   static int[] numArr = {3,30,34,5,9};
   static int[] numArr = {0,0,0,0,0,0};
   
   //숫자가 들어있는 메소드
   public static String function(int[] numArr) {
       String answer = "";
           
        //int 배열을 String 배열로 변환
        String[] arr = new String[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            arr[i] = (String.valueOf(numArr[i]));
        }
        
        //배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
        // Arrays.sort() : 배열 오름차순 정렬
        
//        Comparable - 기본 정렬기준을 구현하는데 사용.
//        Comparator - 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용. 
           //new Comparator<String>() { 내용 넣기 }  
        
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        //0000 처럼 0으로만 구성되어있으면 0 return
        if (arr[0].equals("0")) return "0";
        
        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
      
   }
   
   
   public static void main(String[] args) {
      System.out.println(function(numArr));
   }

}