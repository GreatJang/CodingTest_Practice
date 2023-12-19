import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        while(order>0){
            intList.add(order%10);
            order/=10;
        }
        Collections.reverse(intList);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 3 || intList.get(i) == 6 || intList.get(i) == 9) {
                answer++;
            }
        }
        return answer;
    }
}