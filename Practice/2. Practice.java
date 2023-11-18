// 프로그래머스 최댓값 만들기(1)

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        return numbers[n-1] * numbers[n-2];
        
        // 배열을 정렬 한 다음 길이의 n번째와 n-1번째를 곱하기
        // 첫 답안 return numbers[n] * numbers[n-1]; = 오류 남
        // return n; 을 하면 원소의 갯수 가 반환된다.
        // == [1, 2, 3, 4, 5] == n = 5
        // == [0, 31, 24, 10, 1, 9] == n = 6
        // 첫 답안이 오류가 났던 이유는 배열 첫번째 원소는 0번으로 시작하기 때문에
        // 원소의 갯수에서 -1을 해주어야 배열에서 원소의 실제 위치 값이 나온다.
        // 그래서 최종 return 문에서 numbers 배열에 -1씩 더 해주었더니 정답.
    }
}