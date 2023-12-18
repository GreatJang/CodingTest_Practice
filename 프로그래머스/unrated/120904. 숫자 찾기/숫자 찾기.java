import java.util.*;
class Solution {
    public int solution(int num, int k) {
        List<Integer> intList = new ArrayList<>();
        while(num>0){
            intList.add(num%10);
            num/=10;
        }
        Collections.reverse(intList);
        if(intList.indexOf(k)>=0){
            return (intList.indexOf(k)+1);
        }else{
            return -1;
        }
    }
}