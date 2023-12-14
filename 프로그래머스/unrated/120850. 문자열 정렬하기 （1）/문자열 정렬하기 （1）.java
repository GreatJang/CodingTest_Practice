import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        String temp = my_string.replaceAll("[^0-9]","");
        int[] answer = Stream.of(temp.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }
}