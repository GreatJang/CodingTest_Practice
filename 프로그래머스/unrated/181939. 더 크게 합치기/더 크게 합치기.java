import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = a + "";
        String answer1 = a1+b;
        String answer2 = b+a1;
        int answer11 = Integer.parseInt(answer1);
        int answer22 = Integer.parseInt(answer2);
        
        if(answer11 > answer22){
            return answer11;
        }
        if(answer11 < answer22){
            return answer22;
        }
        else{
            return answer22;
        }
    }
}