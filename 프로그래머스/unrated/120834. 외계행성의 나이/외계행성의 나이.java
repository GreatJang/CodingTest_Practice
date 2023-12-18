import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        List<Integer> newList = new ArrayList<>();
        if(age<10 && age>0){
            newList.add(0,age);
        }
        if(age<100 && age>=10){
            newList.add(0, age / 10);
            newList.add(1, age%10);
        }
        if(age>=100){
            int a = age/10;
            newList.add(0, age / 100);
            newList.add(1, a % 10);
            newList.add(2, age % 10);
        }
        if(age == 1000){
            return "baaa";
        }
        
        char[] newChar = new char[newList.size()];
        for(int i=0; i< newList.size(); i++){
            newChar[i] = (char) (newList.get(i) + 97);
        }
        answer += new String(newChar);
        return answer;
    }
}