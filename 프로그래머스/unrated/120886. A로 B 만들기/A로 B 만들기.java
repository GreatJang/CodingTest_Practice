import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder aft = new StringBuilder(after);
        for (int i = 0; i < before.length(); i++) {
            String a = String.valueOf(before.charAt(i));
//            System.out.println(aft.indexOf(a));
            if(aft.indexOf(a) == -1){
                answer = 0;
                break;
            }
            if(aft.indexOf(a) == 0){
                answer = 1;
            }
            aft.deleteCharAt(aft.indexOf(a));
        }
        return answer;
    }
}