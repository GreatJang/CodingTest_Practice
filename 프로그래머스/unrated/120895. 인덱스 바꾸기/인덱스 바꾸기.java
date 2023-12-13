import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_char = my_string.toCharArray();
        String answer = "";
        char temp = my_char[num1];
        my_char[num1] = my_char[num2];
        my_char[num2] = temp;
        // 배열을 다시 문자열로 변환 시 for문 돌리는게 빠름.
        for(int i=0; i<my_char.length; i++){
            answer += my_char[i];
        }
        return answer;
    }
}