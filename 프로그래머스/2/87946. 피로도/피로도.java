import java.util.*;
class Solution {
    static int answer=0;
    static int count=0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        permutation(k, dungeons, visited);
        return answer;
    }
    static void permutation(int k, int[][] dungeons, boolean[] visited){
            if(count > answer){
                answer = count;
            }
            if(count == dungeons.length) {
                return;
            }
        for (int i = 0 ; i < dungeons.length; i++) {
            if(visited[i] == false && dungeons[i][0] <= k){
                visited[i] = true;
                count ++;
                k -= dungeons[i][1];
                permutation(k, dungeons, visited);
                visited[i] = false;
                count --;
                k += dungeons[i][1];
            }
        }
    }
}