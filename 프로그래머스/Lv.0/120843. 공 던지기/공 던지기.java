import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {

        int length = numbers.length; // 배열길이
        int longindex = k * 2 - 2; // 배열을 반복해서 나열한다고 생각하고 오른쪽으로 두칸씩 넘어가기 때문에 *2
//        -2해주어야 배열 나열했을때 k번째 던졌을때 요소값을 뽑을 수 있음
        int index = longindex - length;
        for(int i=0; i<Integer.MAX_VALUE; i++){

            if(index>length){
                index -= length;
            }
            else if(index<length){
                break;
            }
        }
        if(length>longindex){
           index = longindex;
       }
        return numbers[index];
    }
}