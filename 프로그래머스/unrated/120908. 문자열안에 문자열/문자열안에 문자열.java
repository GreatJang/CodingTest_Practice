class Solution {
    public int solution(String str1, String str2) {
        if(str1.contains(str2))
            // contains :
            // 문자열이 특정 부분 문자열(substring)을 포함하고 있는지 여부를 확인하는 메서드
            return 1;
        else
            return 2;
    }
}