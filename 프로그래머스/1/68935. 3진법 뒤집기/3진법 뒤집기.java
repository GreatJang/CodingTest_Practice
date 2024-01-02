class Solution {
    public int solution(int n) {
        String a = Integer.toString(n,3); // 10진법을 3진법으로 변환(String)
        char[] arr = a.toCharArray(); // char 배열에 3진법(String)값 초기화

        for (int i = 0; i < a.length()/2; i++) { // 배열 뒤집기 로직
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String answer = new String(arr); // 문자배열을 String으로 변환
        return Integer.parseInt(answer,3); // 3진법을 10진법으로 변환하여 출력
    }
}