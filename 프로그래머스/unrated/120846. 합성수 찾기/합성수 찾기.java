import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int count =0;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count+=1;
                }
            }
            if (count >= 3) {
                answer.add(i);
                count = 0;
            }
        }
        return answer.size();
    }
}