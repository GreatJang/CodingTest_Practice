import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        
        int answer = 0;
        Queue<Integer> myQue = new PriorityQueue<>();
        for(int a : scoville){
            myQue.add(a);
        }
        for (int i = 0; i <= K; i++){
            if(myQue.size() == 1 && myQue.peek()<K){
                answer = -1;
                break;
            }
            if(myQue.peek() >=K){
                break;
            }
            int temp = myQue.poll();
            int temp1 = myQue.poll();
            int temp2 = temp + (temp1*2);
            myQue.add(temp2);
            answer ++;

        }
            // System.out.println(myQue);
        return answer;
    }
}