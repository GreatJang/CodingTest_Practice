class Solution {
    public String solution(String my_string) {
        // toCharArray : String 문자열을 char형 문자 배열로 바꿔서 반환해주는 메서드
        // toCharArray() 메서드는 String 클래스의 메서드
        // my_string이라는 문자열을 char 형식의 배열로 변환하여 배열 a에 저장
        char[] a = my_string.toCharArray();
        // 문자 배열 뒤집기
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        // 뒤집힌 문자 배열을 문자열로 변환하여 출력
        String answer = new String(a);
        return answer;
    }
}