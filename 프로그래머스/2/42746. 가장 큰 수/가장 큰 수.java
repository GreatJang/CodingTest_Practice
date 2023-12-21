import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(num, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        String answer = String.join("", num);
        if(answer.charAt(0) == '0'){
            return "0";
        }
        return answer;
    }
}