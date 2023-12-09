class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 'a' && arr[i]<='z'){
                arr[i] -= 32;
                answer += arr[i];
            } else if (arr[i] >= 'A' && arr[i] <= 'z'){
                arr[i] += 32;
                answer += arr[i];
            }
        }
        return answer;
    }
}