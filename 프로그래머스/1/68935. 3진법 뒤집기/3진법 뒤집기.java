class Solution {
    public int solution(int n) {
        String a = Integer.toString(n,3);
        char[] arr = a.toCharArray();

        for (int i = 0; i < a.length()/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String answer = new String(arr);
        return Integer.parseInt(answer,3);
    }
}