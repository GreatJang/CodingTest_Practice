import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] numbers_combination = new int[numbers.length*numbers.length];
        int combination_count = 0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j< numbers.length; j++){
                numbers_combination[combination_count] = numbers[i]+numbers[j];
                combination_count++;
            }
        }
        int[] temp = Arrays.copyOfRange(numbers_combination,0,combination_count);
        Arrays.sort(temp); // 정렬
        int[] new_temp = new int[temp.length]; // 중복제거 시작
        int index = 0;
        for(int i=0; i<temp.length-1; i++) {
            if (temp[i] != temp[i + 1]) {
                new_temp[index] = temp[i];
                index++;
            }
        }
        new_temp[index++] = temp[temp.length-1];
        int[] answer = Arrays.copyOfRange(new_temp,0,index);
        return answer;
    }
}

// 리스트 사용
//             List<Integer> myList = new ArrayList<>();
//                 for(int i=0; i<numbers.length-1; i++){
//                     for(int j=i+1; j< numbers.length; j++){
//                         if(!myList.contains(numbers[i]+numbers[j])){
//                             myList.add(numbers[i]+numbers[j]);
//                         }
//                     }
//                 }
//                 Collections.sort(myList);
//                 int[] answer = new int[myList.size()];
//                 for(int i=0; i<myList.size(); i++){
//                     answer[i] = myList.get(i);
//                 }
//                 System.out.println(myList);