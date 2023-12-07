class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp >= '1' && temp <= '9'){
                answer += Character.getNumericValue(temp);
            }
        }
        return answer;
    }
}