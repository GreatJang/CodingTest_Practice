import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = a + "";
        String answer1 = b+a1;
        String answer2 = a1+b;
        if(Integer.parseInt(answer1) > Integer.parseInt(answer2)){
            answer = Integer.parseInt(answer1);
        }
        if(Integer.parseInt(answer1) < Integer.parseInt(answer2)){
            answer = Integer.parseInt(answer2);
        }
        if(Integer.parseInt(answer1) == Integer.parseInt(answer2)){
            answer = Integer.parseInt(answer2);
        }
        return answer;
    }
}