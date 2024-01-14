import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String a = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i++) {
            a += String.valueOf(my_str.charAt(i));
            if (a.length() == n) {
                list.add(a);
                a = "";
            }else if(i ==my_str.length()-1){
                list.add(a);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}