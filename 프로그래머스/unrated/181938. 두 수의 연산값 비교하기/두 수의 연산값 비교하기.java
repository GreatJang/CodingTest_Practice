class Solution {
    public int solution(int a, int b) {
        String a1 = a+""+b;
        
        int answer1 = Integer.parseInt(a1);
        int answer2 = 2*a*b;
        return (answer1>answer2 ? answer1:answer2);
    }
}