class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            String a = String.valueOf(my_string.charAt(i));
            if(a.equals(alp)){
                answer += a.toUpperCase();
            }else{
                answer += a;
            }
        }
        return answer;
    }
}