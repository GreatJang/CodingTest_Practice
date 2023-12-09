import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        if(numbers[numbers.length-1]*numbers[numbers.length-2] >
           numbers[0]*numbers[1]){
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
            
        } else if(numbers[numbers.length-1]*numbers[numbers.length-2] <
                  numbers[0]*numbers[1]){
            answer = numbers[0]*numbers[1];
        } else if(numbers[numbers.length-1]*numbers[numbers.length-2] ==
                  numbers[0]*numbers[1]){
            answer = numbers[0]*numbers[1];
        }
        return answer;
    }
}