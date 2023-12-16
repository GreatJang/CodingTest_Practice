import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> numberList = new LinkedList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        if (direction.equals("right")) {
            int lastElement = numberList.removeLast();
            numberList.addFirst(lastElement);
        } else if (direction.equals("left")) {
            int firstElement = numberList.removeFirst();
            numberList.addLast(firstElement);
        }

        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int[] numbers, String direction) {
//         List<Integer> newList = new ArrayList<>();
//         for(int a : numbers){
//             newList.add(a);
//         }
        
//         if(direction.equals("right")){
//             newList.add(0,newList.size());
//             newList.remove(newList.size()-1);
//         } else if(direction.equals("left")){
//             newList.add(newList.size(), newList.get(0));
//             newList.remove(0);
//         }
        
//         int[] answer = new int[newList.size()];
//         for (int i = 0; i < newList.size(); i++) {
//             answer[i] = newList.get(i);
//         }
//         return answer;
//     }
// }
//String 문자열 비교시 무조건 .equals 쓰기 안써서 정상동작 X
//else문에 처음에는 if문으로만 사용했는데 오류나서 정상동작X