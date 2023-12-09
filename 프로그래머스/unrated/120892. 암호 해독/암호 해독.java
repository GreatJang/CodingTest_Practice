class Solution {
    public String solution(String cipher, int code) {
        int k = code -1;
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i=k; i<cipher.length(); i+=code){
            answer += arr[i];
        }
        return answer;
    }
}