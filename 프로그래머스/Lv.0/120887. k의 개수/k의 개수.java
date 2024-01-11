class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = Integer.toString(k);
        for(int a=i; a<=j; a++){
            for(int b=0; b<Integer.toString(a).length(); b++){
                if(String.valueOf((Integer.toString(a).charAt(b))).equals(s)){
                    answer ++;
                }
            }
        }
        return answer;
    }
}