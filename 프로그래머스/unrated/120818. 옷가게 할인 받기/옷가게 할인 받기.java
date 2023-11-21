class Solution {
    public int solution(int price) {
        if(price >= 500000) {
            double answer = (double) price * 0.80;
            return (int) answer;
        }
        if(price >= 300000) {
            double answer = (double) price * 0.90;
            return (int) answer;
        }
        if(price >= 100000) {
            double answer = (double) price * 0.95;
            return (int) answer;
        }
        return price;
    } 
}