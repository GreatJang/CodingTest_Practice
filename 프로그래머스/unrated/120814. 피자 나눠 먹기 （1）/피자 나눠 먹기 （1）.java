class Solution {
    public int solution(int n) {
        if(1<= n && n <=7) {
            return 1;
        }
        return (int)Math.ceil((double) n/7);
    }
}
// Math.ceil은 소수점 올림