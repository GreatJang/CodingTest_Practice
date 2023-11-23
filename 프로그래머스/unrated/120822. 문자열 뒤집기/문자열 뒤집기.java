class Solution {
    public String solution(String my_string) {
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
// public class StringReverseExample {
//     public static void main(String[] args) {
//         String original = "Hello, World!";
        
//         // 문자열을 문자 배열로 변환
//         char[] charArray = original.toCharArray();
        
//         // 문자 배열 뒤집기
//         for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
//             char temp = charArray[i];
//             charArray[i] = charArray[j];
//             charArray[j] = temp;
//         }
        
//         // 뒤집힌 문자 배열을 문자열로 변환하여 출력
//         String reversed = new String(charArray);
//         System.out.println("Reversed using char array: " + reversed);
//     }
// }