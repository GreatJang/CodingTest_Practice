import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        ////        split : 리턴값은 String 배열
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
        
        String a = "";
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            a +=String.valueOf(my_string.charAt(i));
            if(String.valueOf(my_string.charAt(i)).equals(" ")){
                String b = a.replace(" ", "");
                list.add(b);
                a="";
            }
            if(i == my_string.length()-1){
                list.add(a);
                a="";
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
        
    }
}