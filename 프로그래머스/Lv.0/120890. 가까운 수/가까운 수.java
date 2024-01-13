import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer =0;
        int[] a = new int[array.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            a[i] = Math.abs(n - array[i]);
            map.put(array[i], a[i]);
        }
        Integer minvalue= Collections.min((map.values()));
        for(Integer i : map.keySet()){
            if(map.get(i) == minvalue){
                answer = i;
                break;
            }
        }
        return answer;
    }
}