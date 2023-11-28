class Solution {
    public int[] solution(int money) {
        int n = money/5500;
        int m = money - (5500 * n);
        int[] answer = {n,m};
        return answer;
    }
}