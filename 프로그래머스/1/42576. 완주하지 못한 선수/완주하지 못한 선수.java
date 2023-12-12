import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        List<String> myList = new ArrayList<>(Arrays.asList(participant));
        List<String> myList2 = new ArrayList<>(Arrays.asList(completion));
        Map<String, Integer> myMap = new HashMap<>();
        
        for(String a : myList){
            if(myMap.containsKey(a)){
                myMap.put(a, myMap.get(a)+1);
            }else{
                myMap.put(a,1);
            }
        }

        for(String a : myList2){
            if(myMap.get(a) >= 1){
                myMap.put(a, myMap.get(a)-1);
            }
            if(myMap.get(a) < 1){
                myMap.remove(a);
            }
        }
        
        String answer = "";
        for(String a : myMap.keySet()){
            answer += a;
        }
        return answer;     
    }
}