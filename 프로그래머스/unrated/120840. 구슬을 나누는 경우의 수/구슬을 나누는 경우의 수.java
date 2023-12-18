import java.util.*;

class Solution {
static int answer;
static int temp=0;
    public int solution(int balls, int share) {
        recur(balls, share, 0);
        return(answer);
    }
    
    static void recur(int balls, int share, int start){
        if(temp == share){
            answer ++;
        }
        for(int i = start; i< balls; i++){
            temp ++;
            recur(balls, share, i+1);
            temp --;
        }
    }
}