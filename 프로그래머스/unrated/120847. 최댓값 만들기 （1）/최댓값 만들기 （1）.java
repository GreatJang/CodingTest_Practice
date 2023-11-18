import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        return numbers[n-1] * numbers[n-2];
    
        // 배열을 정렬 한 다음 길이의 n번째와 n-1번째를 곱하기
    }
}