import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_char = my_string.toCharArray();
        String answer = "";
        char temp = my_char[num1];
        my_char[num1] = my_char[num2];
        my_char[num2] = temp;
        for(int i=0; i<my_char.length; i++){
            answer += my_char[i];
        }
        return answer;
        // String answer = Arrays.toString(my_char);
        // return answer;
    }
}