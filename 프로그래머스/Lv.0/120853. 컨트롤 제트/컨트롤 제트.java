import java.util.*;
class Solution {
    public int solution(String s) {
        String[] a = s.split(" ");
            int count = 0;
            for(int i=0; i<a.length; i++){
                if(a[i].equals("Z")){
                    count -= Integer.parseInt(a[i-1]);

                }
                else {
                    count += Integer.parseInt(a[i]);
                }
            }
        return count;
    }
}