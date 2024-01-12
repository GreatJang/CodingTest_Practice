import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] a = new Integer[emergency.length];
        for(int i=0; i< emergency.length; i++){
            a[i] =  emergency[i];
        }
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int i = 0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] == a[j]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}