class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] a = new char[my_string.length()];
            for(int i = 0; i < my_string.length(); i++) {
                a[i] = my_string.charAt(i);
                for(int m = 1; m <= n; m++){
                    answer += a[i];
                }
            }
        return answer;
    }
}