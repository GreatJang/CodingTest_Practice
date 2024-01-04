class Solution {
    public int solution(String str1, String str2) {
        boolean answer = str2.contains(str1);
        if(answer == true){
            return 1;
        }else {
            return 0;
        }
    }
}