class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += hp/5;
        int i = hp%5;
        answer += i/3;
        int j = i%3;
        answer += j;
        return answer;
    }
}