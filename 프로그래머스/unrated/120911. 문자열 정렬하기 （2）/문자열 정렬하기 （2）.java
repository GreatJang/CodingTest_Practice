import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] arr1 = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            if(arr[i]>='A' && arr[i] <= 'Z'){
                arr[i] +=32;
                arr1[i] += arr[i];
            }
            else if(arr[i]>='a' && arr[i] <= 'z'){
                arr1[i] += arr[i];
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            answer += arr1[i];
        }
        return answer;
    }
}