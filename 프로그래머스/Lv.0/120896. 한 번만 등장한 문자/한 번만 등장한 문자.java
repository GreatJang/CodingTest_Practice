import java.util.*;
class Solution {
    public String solution(String s) {
        int count =0;
        String answer ="";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(String.valueOf(s.charAt(i))) == true){
                count ++;
            }else{
                count =1;
            }
            map.put(String.valueOf(s.charAt(i)), count);
        }
        System.out.println(map);
        for(String a : map.keySet()){
            if(map.get(a)==1){
                answer +=a;
            }
        }
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        return answer;
    }
}