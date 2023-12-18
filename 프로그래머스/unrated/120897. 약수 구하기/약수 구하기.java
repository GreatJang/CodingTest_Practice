import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> newList = new ArrayList<>();
        int count=0;
        for (int i = n; i >= 1; i--) {
            if(n%i == 0){
                count++;
                newList.add(count-1,n/i);
            }
        }
        int[] answer = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            answer[i] = newList.get(i);
        }
        return answer;
    }
}